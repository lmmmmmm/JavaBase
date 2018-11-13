package proxy.nondynamic.impl;

import proxy.nondynamic.Subject;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-2 下午3:21
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void dealTask(String taskName) {
        System.out.println("开始执行任务");
        subject.dealTask("任务是" + taskName);
        System.out.println("任务执行完成");
    }

}
