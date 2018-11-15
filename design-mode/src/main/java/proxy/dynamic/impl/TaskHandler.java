package proxy.dynamic.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-15 下午11:27
 */
public class TaskHandler implements InvocationHandler {

    /**
     * 要代理的真实对象
     */
    private Object obj;

    /**
     * 给要代理的对象赋初值
     *
     * @param obj
     */
    public TaskHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * @param proxy  代理类的实例
     * @param method 被调用的方法对象
     * @param args   调用参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(obj, args);
        after();
        return result;
    }


    private void before() {
        System.out.println("开始写代码！");
    }

    private void after() {
        System.out.println("结束写代码！");
    }
}
