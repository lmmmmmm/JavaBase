package factory.static2factory;


/**
 * @author lming.41032@gmail.com
 * @date 18-9-9 下午11:19
 */
public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("wang! wang! wang!");
    }
}
