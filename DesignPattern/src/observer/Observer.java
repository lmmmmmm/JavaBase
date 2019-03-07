package observer;

/**
 * 抽象观察者：为所有具体观察者定义一个接口
 *
 * @author lming.41032@gmail.com
 * @date 18-12-11 下午12:21
 */
public interface Observer {

    /**
     * 观察者发送信息
     *
     * @param message 信息
     */
    void setMessage(String message);
}
