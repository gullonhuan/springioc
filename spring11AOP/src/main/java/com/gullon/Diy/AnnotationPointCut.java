package com.gullon.Diy;

//方式三，使用注解实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.gullon.service.UserServiceImpl.*(..))")
    public void before (){
        System.out.println("方法执行前~！");
    }

    @After("execution(* com.gullon.service.UserServiceImpl.*(..))")
    public void After(){
        System.out.println("方法执行后 ~！");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点；
    @Around("execution(* com.gullon.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();//获取签名
        System.out.println(signature);
        Object proceed = jp.proceed(); //执行方法
        System.out.println("环绕后");
    }


}
