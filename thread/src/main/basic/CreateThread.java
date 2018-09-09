package main.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程三种方式
 * 1.继承Thread类,重写run方法
 * <p>
 * 2.实现Runnable 接口，实现run方法（将线程对象和线程任务对象分离，减轻耦合，便于维护）
 * <p>
 * 3.实现Callable<T>接口，实现call方法，创建FutureTask<T>对象，将实现Callable<T>接口对象传递给FutureTask<T>对象
 * 创建Thread对象，讲FutureTask对象传给Thread对象。（可以获得线程执行完后的返回值）
 *
 * @author lming.41032@gmail.com
 * @date 18-6-7 上午1:06
 */
public class CreateThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Task1 thread1 = new Task1();
        Thread thread2 = new Thread(new Task2());
        FutureTask<String> task3 = new FutureTask<>(new Task3());
        Thread thread3 = new Thread(task3);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(task3.get());
    }
}


class Task1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("任务一正在运行");
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("任务二正在运行");
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("任务三正在运行");
        return "任务三";
    }
}