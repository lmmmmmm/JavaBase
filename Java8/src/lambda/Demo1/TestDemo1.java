package lambda.Demo1;

import lambda.User;
import lambda.Demo1.service.UserFilterStrategy;
import lambda.Demo1.service.impl.AgeFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * lambda 表达式小例子:筛选用户信息
 *
 * @author lming.41032@gmail.com
 * @date 18-12-13 上午11:47
 */
public class TestDemo1 {

    private List<User> userList = Arrays.asList(
            new User("张三", 25, 555),
            new User("李四", 32, 666),
            new User("王五", 43, 777),
            new User("赵六", 58, 888)
    );

    /**
     * 最原始筛选:筛选年龄大于30的人
     */
    public List<User> filterUserInfo() {
        List<User> users = new ArrayList<>();
        for (User user : this.userList) {
            if (user.getAge() > 30) {
                users.add(user);
            }
        }
        return users;
    }

    /**
     * 通过设计模式来筛选用户信息,结果取决于接口方法参数所传的实现类
     *
     * @param userFilterStrategy
     * @return
     */
    public List<User> filterUserInfo(UserFilterStrategy<User> userFilterStrategy) {
        List<User> users = new ArrayList<>();
        for (User user : this.userList) {
            if (userFilterStrategy.filterUser(user)) {
                users.add(user);
            }
        }
        return users;
    }

    public static void main(String[] args) {
        List<User> usersInfo = Arrays.asList(
                new User("张三", 25, 555),
                new User("李四", 32, 666),
                new User("王五", 43, 777),
                new User("赵六", 58, 888)
        );


        TestDemo1 test = new TestDemo1();
        System.out.println("---------------------原始方法筛选-------------------------");
        List<User> originalUserList = test.filterUserInfo();
        for (User user : originalUserList) {
            System.out.println(user);
        }
        System.out.println("---------------------设计模式筛选-------------------------");
        List<User> designPatternsUserList = test.filterUserInfo(new AgeFilter());
        for (User user : designPatternsUserList) {
            System.out.println(user);
        }
        System.out.println("---------------------匿名内部类方式筛选-------------------------");
        List<User> anonymousUserList = test.filterUserInfo(new UserFilterStrategy() {
            @Override
            public boolean filterUser(Object o) {
                return ((User) o).getAge() > 30;
            }
        });
        for (User user : anonymousUserList) {
            System.out.println(user);
        }
        System.out.println("---------------------lambda表达式筛选-------------------------");
        List<User> lambdaUserList = test.filterUserInfo((e) -> e.getAge() > 30);
        lambdaUserList.forEach(System.out::println);
        System.out.println("---------------------流式api筛选-------------------------");
        usersInfo.stream()
                .filter((user) -> user.getAge() > 30)
                .forEach(System.out::println);
    }
}
