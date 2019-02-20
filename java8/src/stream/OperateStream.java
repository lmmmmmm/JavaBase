package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 流的中间操作: 中间操作不会执行任何操作，只有执行终止操作，一次性执行全部内容，这个过程称为惰性求值
 * <p>
 * 1：filter
 *
 * @author lming.41032@gmail.com
 * @date 19-2-16 下午5:11
 */
public class OperateStream {

    public static void main(String[] args) {
        filter();
        limit();
        skip();
        distinct();
        map();
        flatmap();
        mapToInt();
        peek();
    }

    /**
     * 从流中筛选过滤数据
     */
    public static void filter() {
        System.out.println("--------Stream的filter操作");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> filterStream = stream.filter((x) -> x > 2);
        filterStream.forEach(System.out::println);
    }

    /**
     * 截断流：使流中元素不超过给定个数
     */
    public static void limit() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        System.out.println("--------Stream的limit操作");
        stream.limit(2).forEach(System.out::println);
    }

    /**
     * 跳过元素：去除流中前n个元素
     */
    public static void skip() {
        System.out.println("--------Stream的skip操作");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.skip(3L).forEach(System.out::println);
    }

    /**
     * 去重：通过流中元素hashCode()和equals()比较去重
     */
    public static void distinct() {
        System.out.println("--------Stream的distinct操作");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 2, 6);
        stream.distinct().forEach(System.out::println);
    }


    /**
     * 映射:接受一个函数作为参数，该函数会被应用都流中的每个元素，并映射为一个新的流
     */
    public static void map() {
        System.out.println("--------Stream的映射操作");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 2, 6);
        stream.map((x) -> x + 2).forEach(System.out::println);

        Arrays.asList("dog", "cat", "pig")
                .stream()
                .map((str) -> str.toUpperCase())
                .forEach(System.out::println);
    }

    /**
     * mapToLong mapToDouble 同理
     */
    public static void mapToInt() {
        System.out.println("--------Stream的mapToInt操作");
        Stream<String> stream = Stream.of("a", "b", "c", "d");
        stream.mapToInt(a -> a.hashCode()).forEach(System.out::println);

    }

    public static void peek() {
        System.out.println("--------Stream的peek操作");
        Stream<String> stream = Stream.of("a", "b", "c", "d");
        stream.peek((a) -> System.out.println(a.toUpperCase())).count();
    }

    /**
     *
     */
    public static void flatmap() {
        System.out.println("--------Stream的flatmap操作");
        String poetry = "Where, before me, are the ages that have gone?\n" +
                "And where, behind me, are the coming generations?\n" +
                "I think of heaven and earth, without limit, without end,\n" +
                "And I am all alone and my tears fall down.";
        Stream<String> lines = Arrays.stream(poetry.split("\n"));
        Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(" ")));
        List<String> l = words.map(w -> {
            if (w.endsWith(",") || w.endsWith(".") || w.endsWith("?")) {
                return w.substring(0, w.length() - 1).trim().toLowerCase();
            } else {
                return w.trim().toLowerCase();
            }
        }).distinct().sorted().collect(Collectors.toList());
        System.out.println(l);
    }

}
