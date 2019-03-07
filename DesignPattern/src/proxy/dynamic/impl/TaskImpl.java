package proxy.dynamic.impl;

import proxy.dynamic.Task;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-15 下午11:26
 */
public class TaskImpl implements Task {

    @Override
    public void doSomeThing() {
        System.out.println("写代码！");
    }
}
