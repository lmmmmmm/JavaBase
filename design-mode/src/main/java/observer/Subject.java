package observer;

/**
 * 主题（抽象通知者）:提供接口，增加和删除观察者对象
 *
 * @author lming.41032@gmail.com
 * @date 18-12-11 下午12:17
 */
public interface Subject {

    /**
     * 增加观察者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void detach(Observer observer);


    /**
     * 通知观察者
     *
     * @param message
     */
    void notifyObservers(String message);
}
