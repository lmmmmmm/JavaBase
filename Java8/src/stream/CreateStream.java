package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 一:stream 的三个操作
 * 1 创建stream
 * 2 中间操作
 * 3 终止操作
 *
 * @author lming.41032@gmail.com
 * @date 19-2-16 下午4:45
 */
public class CreateStream {


    public static void main(String[] args) {
        createStream();

    }

    public static void createStream() {
        // 1 通过Collection 提供的stream()或parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        //2 通过Arrays中的静态方法stream()获取数组流
        User[] users = new User[10];
        Stream<User> userStream = Arrays.stream(users);

        // 3 通过Stream的静态方法of()创建流
        Stream<String> strStream = Stream.of("aa", "bb");

        //4 创建无限流
        // 4.1 迭代
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(10).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        // 4.2 生成
        Stream<Integer> generate = Stream.generate(() -> (int) (Math.random() * 10));
        generate.limit(5).forEach(System.out::println);
    }

}
