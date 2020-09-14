package com.ly.zj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注这个类是切面
public class Pointcut {
    @Before("execution(* com.ly.TestC.*(..))")
    public void function1(){
        System.out.println("方法执行前");//2
    }
    @After("execution(* com.ly.TestC.*(..))")
    public void function2(){
        System.out.println("方法执行后");//3
    }
    //在环绕增强中，可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.ly.TestC.*(..))")
    //ProceedingJoinPoint连接点
    public void function3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");//1
        Object proceed = jp.proceed();
        System.out.println("环绕后");//4

        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature"+signature);

    }
}
