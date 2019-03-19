package basic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 通过lambda表达式创建线程,()-> {//code}
 *
 * @author lming.41032@gmail.com
 * @date 18-6-7 上午2:02
 */
public class CreateThreadByLambda {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("任务一正在运行");
                try {
                    Thread.sleep(3 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        FutureTask<String> task2 = new FutureTask<>(() -> {
//            while (true) {
//                System.out.println("任务二正在运行");
//                try {
//                    Thread.sleep(2 * 1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            //TODO 为什么加上while(true)可以没有返回值？ 为什么返回值要在while中加，
            //TODO  如果在while中加上返回值，就会终止线程，那么加上返回值还有什么用呢？
            System.out.println("任务二正在运行");
            return "任务二";
        });
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
        System.out.println(task2.get());

    }
}
