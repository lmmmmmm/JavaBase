/**
 * ThreadLocal
 *
 * @author lming.41032@gmail.com
 * @date 19-3-17 下午11:44
 */
public class ThreadLocalTest {

    private static  ThreadLocal<String> td = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            System.out.println("线程一中ThreadLocal的hashCode为" + td.hashCode());
            System.out.println("线程一未设置值时为：" + td.get());
            td.set("123");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程一获得的ThreadLocal值为：" + td.get());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("线程二中ThreadLocal的hashCode为" + td.hashCode());
            System.out.println("线程二在未设置值时为：" + td.get());
            td.set("456");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程二获得的ThreadLocal值为：" + td.get());
        });

        t1.start();
        t2.start();
        System.out.println("main中ThreadLocal的hashCode为" + td.hashCode());
        System.out.println("程序结束后ThreadLocal的值为" + td.get());
    }

}
