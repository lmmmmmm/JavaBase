package factory.method2factory;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-24 下午11:59
 */
public class Bike implements Car {
    @Override
    public void toToWork() {
        System.out.println("骑自行车上班");
    }
}
