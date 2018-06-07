package deadlock;

/**
 * 死锁：两个或多个线程互相持有对方的锁并且等待对方释放。
 *
 * @author lming.41032@gmail.com
 * @date 18-6-7 下午5:59
 */
public class DeadLock {

    private static final Object LOCK1 = new Object();
    private static final Object LOCK2 = new Object();


    private static void deadLock() {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK1) {
                try {
                    System.out.println(Thread.currentThread().getName() + " get Lock1ing");
                    Thread.sleep(2 * 1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " need Lock2 please wait");
                synchronized (LOCK2) {
                    System.out.println(Thread.currentThread().getName() + " get Lock2ing");
                }
            }
        }, "thread1");


        Thread t2 = new Thread(() -> {
            synchronized (LOCK2) {
                try {
                    System.out.println(Thread.currentThread().getName() + " get Lock2ing");
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " need Lock1 please wait");
                synchronized (LOCK1) {
                    System.out.println(Thread.currentThread().getName() + " get Lock1ing");
                }
            }
        }, "thread2");

        t1.start();
        t2.start();
    }


    public static void main(String[] args) {
        DeadLock.deadLock();
    }
}
