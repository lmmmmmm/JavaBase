package observer;

/**
 * @author lming.41032@gmail.com
 * @date 18-12-11 下午12:28
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        //创建一个通知者
        Subject subject = new ConcreteSubject();
        // 创建观察者
        ConcreteObserver c1 = new ConcreteObserver("张三");
        ConcreteObserver c2 = new ConcreteObserver("李四");
        ConcreteObserver c3 = new ConcreteObserver("王五");
        //通知者添加观察者
        subject.attach(c1);
        subject.attach(c2);
        subject.attach(c3);
        //给观察者通知
        subject.notifyObservers("hello");
    }
}
