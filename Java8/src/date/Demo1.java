package date;

import java.time.LocalDateTime;

/**
 * @author lming.41032@gmail.com
 * @date 19-2-20 下午5:09
 */
public class Demo1 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间：" + currentTime);

    }
}
