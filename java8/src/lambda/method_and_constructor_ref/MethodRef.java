package lambda.method_and_constructor_ref;

import lambda.User;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 方法引用: 若Lambda体中的内容已经有方法实现,则可以直接使用"方法引用"
 * 注意:
 * &nbsp;1  Lambda体中调用方法的参数列表要和函数式接口中方法参数列表和返回值相同
 * &nbsp;2  若Lambda参数列表中第一个参数是实例方法的调用者,其他参数是实例方法中的参数,则可以使用 类名::方法名
 * 三种语法格式:
 * &nbsp;1 对象::实例方法名
 * &nbsp;2 类::静态方法名
 * &nbsp;3 类::实例方法名
 * </p>
 *
 * @author lming.41032@gmail.com
 * @date 18-12-15 下午4:08
 */
public class MethodRef {

    public static void main(String[] args) {
        MethodRef.test1("123");
        String test2 = MethodRef.test2(new User("张三", null, null));
        System.out.println(test2);
    }


    /**
     * 对象::实例方法名
     *
     * @param str
     */
    public static void test1(String str) {
        Consumer consumer = System.out::println;
        consumer.accept(str);
    }

    public static String test2(User user) {
        Supplier<String> supplier = user::getUserName;
        return supplier.get();
    }

    /**
     * 类::静态方法名
     */
    public static void test3() {
        Comparator<Integer> comparator = Integer::compare;
        comparator.compare(1, 2);
    }

    /**
     * 类::实例方法名
     */
    public void test4() {
        BiPredicate<String, String> biPredicate = String::equals;
        biPredicate.test("李四", "张三");

    }

}
