package lambda.exercise;

import lambda.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 调用Collections.sort()方法为User排序,先按年龄比,年龄相同按照工资比
 *
 * @author lming.41032@gmail.com
 * @date 18-12-13 下午5:35
 */
public class Sort4User {

    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("张三", 28, 4500),
                new User("李四", 18, 4000),
                new User("王五", 28, 7500),
                new User("赵六", 28, 6500),
                new User("田七", 28, 7000),
                new User("王八", 38, 8000)
        );
        Collections.sort(userList, (user1, user2) -> {
            if (user1.getAge().equals(user2.getAge())) {
                return Integer.compare(user1.getSalary(), user2.getSalary());
            } else {
                return Integer.compare(user1.getAge(), user2.getAge());
            }
        });
        userList.stream().forEach(System.out::println);
    }
}
