package lambda.method_and_constructor_ref;

import lambda.User;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * see {@link lambda.method_and_constructor_ref.MethodRef}
 * 构造器引用格式:ClassName::new
 * </p>
 * 需要调用的构造器参数列表要与函数式接口中方法的参数列表保持一致
 *
 * @author lming.41032@gmail.com
 * @date 18-12-15 下午5:00
 */
public class ConstructorRef {

    public static void main(String[] args) {

    }

    public void supplier() {
        //Lambda
        Supplier<User> supplier = () -> new User();
        //构造器引用(调用Use无参构造器)
        Supplier<User> supplier1 = User::new;
        //构造器引用(调用User对象有一个参数构造器)
        Function<String, User> function = User::new;
        // 构造器引用,调用user对象有两个参数的构造器
        BiFunction<String, Integer, User> biFunction = User::new;

    }
}
