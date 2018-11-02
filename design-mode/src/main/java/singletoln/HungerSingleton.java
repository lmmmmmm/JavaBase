package main.java.singletoln;

/**
 * 饿汉式单例
 *
 * @author lming.41032@gmail.com
 * @date 18-6-6 下午11:26
 */
public class HungerSingleton {

    private static final HungerSingleton singleton = new HungerSingleton();


    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return singleton;
    }
}
