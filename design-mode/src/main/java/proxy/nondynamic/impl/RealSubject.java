package proxy.nondynamic.impl;


import proxy.nondynamic.Subject;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-2 下午3:21
 */
public class RealSubject implements Subject {

    @Override
    public void dealTask(String taskName) {
        System.out.println("正在" + taskName);
    }
}
