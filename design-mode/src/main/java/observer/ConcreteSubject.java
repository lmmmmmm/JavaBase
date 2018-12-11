package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体通通知者（具体主题）
 *
 * @author lming.41032@gmail.com
 * @date 18-12-11 下午12:48
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.setMessage(message);
        }
    }
}
