package basic;
/**
 * 定义一个异常 需要继承Exception
 *
 * @author lming.41032@gmail.com
 * @date 18-7-2 上午12:07
 */
public class MyException extends Exception {

    private String msg;

    private Integer code;

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MyException(String msg, Integer code) {
        super();
        this.msg = msg;
        this.code = code;
    }

}
