package main.java.singletoln;

/**
 * 懒汉式单例
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午11:23
 */
public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton singleton;

    /**
     * 线程不安全
     *
     * @return 对象实例
     */
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 线程安全（加锁）但效率低
     *
     * @return 对象实例
     */
    public static synchronized LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
