package factory.static2factory;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-9 下午11:23
 */
public class TestStaticFactory {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("dog");
        animal.sound();

    }
}
