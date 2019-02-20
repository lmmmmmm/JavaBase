package optional;

import java.awt.*;
import java.util.Optional;

/**
 * @author lming.41032@gmail.com
 * @date 19-2-20 下午4:43
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;

        // ofNullable 允许传递null的参数
        Optional<Integer> value1Option = Optional.ofNullable(value1);

        // of 不允许参数为空,为空抛出nep
        Optional<Integer> value2Option = Optional.of(value2);
        System.out.println(new Demo1().sum(value1Option, value2Option));
    }


    public Integer sum(Optional<Integer> value1, Optional<Integer> value2) {
        System.out.println("value1是否存在：" + value1.isPresent());
        System.out.println("value2是否存在：" + value2.isPresent());

        Integer val1 = value1.orElse(0);
        Integer val2 = value2.get();
        return val1 + val2;
    }
}
