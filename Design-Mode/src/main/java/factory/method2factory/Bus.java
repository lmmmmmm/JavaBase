package factory.method2factory;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-25 上午12:00
 */
public class Bus implements Car {
    @Override
    public void toToWork() {
        System.out.println("坐公家车上班");
    }
}
