package proxy.dynamic.impl;


import proxy.dynamic.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * @author lming.41032@gmail.com
 * @date 18-11-13 下午10:26
 */
public class HelloImpl implements InvocationHandler {

    private static final String METHOD_NAME = "sayHello";

    private Hello hello;

    public HelloImpl(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(hello, args);
    }
}
