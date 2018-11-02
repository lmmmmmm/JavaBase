package proxy.nondynamic.impl;

import proxy.nondynamic.Subject;

/**
 * @author lming.41032@gmail.com
 * @date 18-11-2 下午3:40
 */
public class ProxySubjectTest {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        //创建代理来实现真实的方法
        ProxySubject proxySubject = new ProxySubject(subject);
        proxySubject.dealTask("写代码");
    }
}
