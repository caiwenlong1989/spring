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
import org.springframework.stereotype.Component;

@Component // 免去在XML配置文件中配置bean
@Aspect // 声明切面
public class MessageAOP {
    // 声明切入点
    // execution(modifier? ret-type declaring-type? name(param) throws?)
    // execution(修饰符可选 返回值类型 声明类型可选 方法名称(参数列表) 抛出异常可选)
    // parame：指定方法参数(声明的类型),(..)代表所有参数,(*)代表一个参数,(*,String)代表第一个参数为任何值,第二个为String类型.
    @Pointcut("execution(** com.kongzhu.demo.spring5.*.*(..))")
    public void pointcut() {}

    // 3.后置通知：通知方法会在目标方法返回或抛出异常后调用
    @After("pointcut()")
    // JoinPoint：提供对连接点上可用状态和静态信息的反射访问，这种反射信息的主要用途是跟踪和记录应用程序。
    public void afterFinallyAdvice(JoinPoint thisJoinPoint) {
        System.out.println("After finally advice: " + thisJoinPoint);
    }

    // 4.返回通知：通知方法会在目标方法返回后调用
    @AfterReturning(value="pointcut()", returning="obj")
    public void afterReturningAdvice(JoinPoint thisJoinPoint, Object obj) {
        System.out.println("After returning advice: " + thisJoinPoint);
        System.out.println("After returning advice the returned value: " + obj);
    }

    // 异常通知：通知方法会在目标方法抛出异常后调用
    @AfterThrowing(value="pointcut()", throwing="e")
    public void afterThrowingAdvice(JoinPoint thisJoinPoint, Throwable e) {
        System.out.println("After throwing advice: " + thisJoinPoint);
        System.out.println("After throwing advice the thrown exception: " + e);
    }

    // 1.环绕通知：通知方法会将目标方法封装起来
    @Around("pointcut()")
    // 
    public Object aroundAdvice(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        System.out.println("Around advice: " + thisJoinPoint);
        Object obj = thisJoinPoint.proceed(); // 继续下一个通知或目标方法调用
        return obj;
    }

    // 2.前置通知：通知方法会在目标方法调用之前执行
    @Before("pointcut()")
    public void beforeAdvice(JoinPoint thisJoinPoint) {
        System.out.println("Before advice the arguments's length: " + thisJoinPoint.getArgs().length);
    }
}
