package basic;

import java.util.concurrent.FutureTask;

/**
 * 通过lambda表达式创建线程,()-> {//code}
 *
 * @author lming.41032@gmail.com
 * @date 18-6-7 上午2:02
 */
public class CreateThreadByLambda {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("任务一正在运行");
                try {
                    Thread.sleep(2 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new FutureTask<>(() -> {
            System.out.println("线程二正在运行");
            return "123";
        }));

        t1.start();
        t2.start();

    }
}
