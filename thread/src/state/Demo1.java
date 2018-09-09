package state;

/**
 * 线程的状态：新建状态、可运行状态、运行状态、阻塞状态、死亡状态
 * <p>
 * public static enum Thread.State 定义线程状态为下：
 * NEW: 没有被执行的状态。
 * RUNNABLE：等待操作系统分配资源的线程
 * BLOCKED：等待监视器锁定。处于阻塞状态的线程正在等待监视器锁定以在调用Object.wait（）后输入同步块/方法或重新输入同步块/方法。
 * WAITING: 等待另一个线程执行特定操作
 * TIME_WAITING: 一个线程等待另一个线程来执行一个操作，在等待这个期间就是TIME_WAITING状态
 * TERMINATED：线程执行完成
 *
 * @author lming.41032@gmail.com
 * @date 18-6-8 下午5:03
 */
public class Demo1 {

    public static void threadStatus() {
        //1、新建状态
        Thread thread1 = new Thread(() -> {
            System.out.println("线程1");
        });

        //2、调用start（）方法进入就绪状态
        thread1.start();

        //3、等待CPU分配资源进入运行状态

        //4、

    }

    public static void main(String[] args) {
        String str = "123457";
        char end = 3;
        System.out.println(str.substring(1, end));
    }

}
