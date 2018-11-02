package main.java.factory.method2factory;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-25 上午12:02
 */
public class Test {

    public static void main(String[] args) {
        CarFactory carFactory;
        carFactory = new BusFactory();
        carFactory.getCar().toToWork();

        carFactory = new BikeFactory();
        carFactory.getCar().toToWork();
    }
}
