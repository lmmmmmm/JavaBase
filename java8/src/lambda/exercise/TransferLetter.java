package lambda.exercise;

/**
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午5:51
 */
@FunctionalInterface
public interface TransferLetter<T> {

    T getValue(T t);
}
