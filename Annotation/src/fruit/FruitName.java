package fruit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author lming.41032@gmail.com
 * @date 18-9-24 上午12:09
 */
@Target(ElementType.FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitName {

    /**
     * 供应商名称
     *
     * @return
     */
    String value() default "";

}
