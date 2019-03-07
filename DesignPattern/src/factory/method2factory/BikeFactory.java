package factory.method2factory;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-25 上午12:01
 */
public class BikeFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }
}
