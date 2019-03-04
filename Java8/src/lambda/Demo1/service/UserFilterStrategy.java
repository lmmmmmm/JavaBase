package lambda.Demo1.service;

/**
 * 生命一个接口提供比较方法.
 *
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午12:01
 */
public interface UserFilterStrategy<T> {

    boolean filterUser(T t);
}
