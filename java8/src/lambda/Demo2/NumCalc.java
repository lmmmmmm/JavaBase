package lambda.Demo2;

/**
 * 函数式接口,提供一个计算方法.
 *
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午5:16
 */
@FunctionalInterface
public interface NumCalc<T> {

    Integer calc(T t1, T t2);
}
