package stream;

/**
 * @author lming.41032@gmail.com
 * @date 18-12-13 上午11:45
 */
public class User {

    private String userName;

    private Integer age;

    private Integer salary;

    public User(String userName, Integer age, Integer salary) {
        this.userName = userName;
        this.age = age;
        this.salary = salary;
    }

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
