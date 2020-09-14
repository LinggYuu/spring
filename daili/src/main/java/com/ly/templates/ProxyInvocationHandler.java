package com.ly.templates;

import com.ly.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;
    //处理代理实例，并返回结果

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);

    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;

    }


    //    生成得到代理类

}
