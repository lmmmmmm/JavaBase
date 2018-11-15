package proxy.dynamic.impl;

import proxy.dynamic.Task;

import java.lang.reflect.Proxy;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-15 下午11:31
 */
public class TaskProxyTest {
    public static void main(String[] args) {

        Task task = new TaskImpl();

        TaskHandler taskProxy = new TaskHandler(task);

        TaskImpl taskImpl = (TaskImpl) Proxy.newProxyInstance(task.getClass().getClassLoader(), task.getClass().getInterfaces(), taskProxy);
        taskImpl.doSomeThing();
    }

}
