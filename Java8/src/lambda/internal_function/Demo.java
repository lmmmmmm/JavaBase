package lambda.internal_function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

/**
 * java8 内置函数型接口: {@link java.util.function}
 * <p>
 * 四大内置核心函数式接口:
 * 1: Consumer<T>    消费型型口:   void accept(T t)
 * 2: Supplier<T>    提供型接口:   T get();
 * 3: Function<T, R> 函数型接口:   R apply(T t);
 * 4: Predicate<T>   断言型接口:   boolean test(T t);
 *
 * @author lming.41032@gmail.com
 * @date 18-12-15 下午3:06
 */
public class Demo {

    public static void main(String[] args) {
        //测试消费型接口
        Demo.consumer(500.20, money -> System.out.println("消费了" + money + "元"));
        // 测试提供型接口
        List<Integer> integerList = Demo.supplier(10, () -> (int) (Math.random() * 100));
        integerList.stream().forEach(System.out::println);
        // 测试函数型接口
        String functionStr = Demo.myFunction("hello world", (x) -> x.toUpperCase());
        System.out.println(functionStr);
        // 测试断言型接口
        boolean flag = Demo.predicate("lmmm", (s) -> s.length() == 3);
        System.out.println(flag);
    }

    /**
     * 消费型接口
     *
     * @param money
     * @param consumer
     */
    public static void consumer(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    /**
     * 提供型接口
     *
     * @param supplier
     * @return
     */
    public static List<Integer> supplier(int num, Supplier<Integer> supplier) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer n = supplier.get();
            resultList.add(n);
        }
        return resultList;
    }

    /**
     * 函数形接口
     *
     * @param str
     * @param function
     * @return
     */

    public static String myFunction(String str, Function<String, String> function) {
        return function.apply(str);
    }

    /**
     * 断言型接口
     *
     * @param str
     * @param predicate
     * @return
     */
    public static boolean predicate(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }
}
