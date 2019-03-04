package fruit;

import java.lang.annotation.*;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-24 上午12:12
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     */
    enum Color {
        BLUE, RED, GREEN
    }


    /**
     * 颜色属性
     */
    Color fruitColor() default Color.GREEN;
}
