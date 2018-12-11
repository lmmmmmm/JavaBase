package observer;

/**
 * @author lming.41032@gmail.com
 * @date 18-12-11 下午1:13
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void setMessage(String message) {
        System.out.println(name + ':' + message);
    }
}
