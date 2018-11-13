package singletoln;

/**
 * 静态内部类
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午11:38
 */
public class StaticInnerClassSingleton {

    private static class LazyHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
    }

    public static final StaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
