package proxy.dynamic.impl;

import proxy.dynamic.Task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-15 下午11:27
 */
public class TaskHandler implements InvocationHandler {

    private Object obj;

    public TaskHandler(Object obj) {
        this.obj = obj;
    }

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
