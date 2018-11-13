package singletoln;

/**
 * 双重if锁单例
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午11:34
 */
public class DoubleIfSingleton {


    private DoubleIfSingleton() {
    }

    private static DoubleIfSingleton singleton = null;

    /**
     * 双重if锁
     *
     * @return
     */
    public static DoubleIfSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleIfSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleIfSingleton();
                }
            }
        }
        return singleton;
    }
}
