package lambda.Demo2;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 1 Lambda表达式语法基础: Java8中引入了一个新的操作符号:"->",称为箭头操作符或者Lambda操作符
 * 操作符左侧是lambda表达式所需的参数,操作符右侧是lambda表达式所需执行的功能,称为lambda体
 * <p>
 * 2 lambda 变化形式:
 * 2.1 没有参数,没有返回值:() -> System.out.println("无参数,无返回值");
 * 2.2 有一个参数,没有返回值:(x) -> System.out.println(x);
 * 2.3 有多个参数,有返回值:(x, y) -> Integer.compare(x, y);
 * 2.4 如果参数只有一个,则()可以省略,如果Lambda体中有多条语句,并且有返回值,则需要加上{}
 * 2.5 参数的类型可以省去,因为Jvm会通过上下文推断出参数的类型,该操作叫做"类型推断"
 * <p>
 * 3 Lambda 需要"函数式接口"的支持:接口中只有一个方法,可以使用@FunctionInterface生命该接口
 *
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午4:32
 */
public class LambdaBasic {

    public static void main(String[] args) {
        //无参数,无返回值
        Runnable runnable = () -> System.out.println("无参数,无返回值");
        runnable.run();

        //有一个参数,没有返回值
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("有一个参数,没有返回值");

        //有多个参数,有返回值
        Comparator<Integer> comparator = (x, y) -> {
            System.out.println("有多个参数,有返回值");
            return Integer.compare(x, y);
        };
        System.out.println(comparator.compare(1, 2));
        System.out.println("-------------------------------");
        Integer val = LambdaBasic.calc(100, 200, (x, y) -> x * y);
        System.out.println("自定义的方法结果是:" + val);
    }


    public static Integer calc(Integer num1, Integer num2, NumCalc<Integer> numCalc) {
        return numCalc.calc(num1, num2);
    }
}
