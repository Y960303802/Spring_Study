package com.xizi.diy;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解实现AOP
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.xizi.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("==========方法执行前=============");
    }
    @After("execution(* com.xizi.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("==========方法执行后=============");
    }
}
