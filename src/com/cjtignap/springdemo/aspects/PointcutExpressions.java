package com.cjtignap.springdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PointcutExpressions {
    @Pointcut("execution(* com.cjtignap.springdemo.DAO.*.*(..))")
    public void pointCutForDAO(){
    }

    @Pointcut("execution(* com.cjtignap.springdemo.Service.*.*(..))")
    public void pointCutForService(){
    }

    @Pointcut("execution(* com.cjtignap.springdemo.controller.*.*(..))")
    public void pointCutForController(){
    }

    @Pointcut("pointCutForController() || pointCutForDAO() || pointCutForService()")
    public void pointCutForDAOServiceAndController(){
    }

}
