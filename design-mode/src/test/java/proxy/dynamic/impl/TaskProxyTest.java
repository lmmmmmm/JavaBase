package proxy.dynamic.impl;

import proxy.dynamic.Task;

import java.lang.reflect.Proxy;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-15 下午11:31
 */
public class TaskProxyTest {
    public static void main(String[] args) {
        /**
         * 被代理类对象
         */
        Task task = new TaskImpl();
        /**
         * 代理类对象
         */
        TaskHandler taskHandler = new TaskHandler(task);
        /**
         * 参数：被代理对象的classLoader，被代理对象的接口，代理对象。
         */
        Task proxy = (Task) Proxy.newProxyInstance(task.getClass().getClassLoader(), task.getClass().getInterfaces(), taskHandler);
        proxy.doSomeThing();
    }
}
