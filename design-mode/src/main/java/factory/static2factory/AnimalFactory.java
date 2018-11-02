package main.java.factory.static2factory;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-9 下午11:20
 */
public class AnimalFactory {

    private AnimalFactory(){}

    public static Animal animal = null;

    public static Animal getAnimal(String name){
        if ("dog".equals(name)) {
            animal = new Dog();
        } else if ("cat".equals(name)) {
            animal = new Cat();
        }
        return  animal;
    }
}
