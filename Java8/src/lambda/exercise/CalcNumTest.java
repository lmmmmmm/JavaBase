package lambda.exercise;

/**
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午6:49
 */
public class CalcNumTest {

    public static void main(String[] args) {
        calc(12L, 45L, (x, y) -> x + y);
        calc(12L, 45L, (x, y) -> x * y);

    }

    public static void calc(Long val1, Long val2, CalcNum<Long, Long> calcNum) {
        System.out.println(calcNum.calc(val1, val2));
    }
}
