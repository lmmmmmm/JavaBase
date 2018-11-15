/**
 * 1 获取Class对象:
 * 1.1  public static Class<?> forName(String className)   获取JDBC驱动;
 * 1.2 直接获取对象的Class
 * 1.3 调用某个对象的getClass方法。
 * <p>
 * 2 public native boolean isInstance(Object obj);判断是否为某个类的实例,使用Class文件的isInstance方法判断。
 * <p>
 * 3 创建实例
 * 3.1 通过Class对象的newInstance方法创建Class对象对应的类实例 //java9方法过期
 * 3.2 通过Class对象获取指定的构造器对象,在通过构造器对象的newInstance方法创建实例。
 *
 * @author lming.41032@gmail.com
 * @date 18-11-16 上午12:41
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        //1.1
        //  Class classA = Class.forName("com.mysql.jdbc.Driver");
        // 1.2
        Class classB = int.class;
        System.out.println(classB);
        // 1.3
        String str = "lmmm";
        Class classC = str.getClass();
        System.out.println(classC);
        // 2
        System.out.println(classC.isInstance(123));
        System.out.println(classC.isInstance("123"));

        //3
        Object o = classC.getDeclaredConstructor(String.class).newInstance("123");
        System.out.println(o);

    }
}
