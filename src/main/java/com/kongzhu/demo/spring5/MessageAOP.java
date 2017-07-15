package com.kongzhu.demo.spring5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MessageAOP {
    @Pointcut("execution(* com.kongzhu.demo.spring5.*.*(..))")
    public void pointcut() {}

    @After("pointcut()") // 通知方法会在目标方法返回或抛出异常后调用
    public void afterFinallyAdvice(JoinPoint thisJoinPoint) {
        System.out.println("@After " + thisJoinPoint);
    }

    @AfterReturning(value="pointcut()", returning="obj") // 通知方法会在目标方法返回后调用
    public void afterReturningAdvice(JoinPoint thisJoinPoint, Object obj) {
        System.out.println("@AfterReturning " + thisJoinPoint);
        System.out.println("@AfterReturning returning: " + obj);
    }

    @AfterThrowing(value="pointcut()", throwing="e") // 通知方法会在目标方法抛出异常后调用
    public void afterThrowingAdvice(JoinPoint thisJoinPoint, Throwable e) {
        System.out.println("@AfterThrowing " + thisJoinPoint);
        System.out.println("@AfterThrowing throwing: " + e);
    }

    @Around("pointcut()") // 通知方法会将目标方法封装起来
    public Object aroundAdvice(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        System.out.println("@Around before proceed " + thisJoinPoint);
        Object obj = thisJoinPoint.proceed(); // 进行下一个通知或目标方法调用
        System.out.println("@Around after proceed " + thisJoinPoint);
        return obj;
    }

    @Before("pointcut()") // 通知方法会在目标方法调用之前执行
    public void beforeAdvice(JoinPoint thisJoinPoint) {
        System.out.println("@Before " + thisJoinPoint);
    }
}
