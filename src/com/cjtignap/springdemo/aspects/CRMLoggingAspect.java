package com.cjtignap.springdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {
    Logger logger = Logger.getLogger(getClass().getName());

    @Before("com.cjtignap.springdemo.aspects.PointcutExpressions.pointCutForDAOServiceAndController()")
    public void beforeAdviceForDAOServiceAndController(JoinPoint joinPoint){
        logger.info("Method signature : "+ joinPoint.getSignature().toShortString()+"\n");
        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            logger.info("Argument : "+ arg);
        }
    }

    @AfterReturning(
            pointcut = "com.cjtignap.springdemo.aspects.PointcutExpressions.pointCutForDAOServiceAndController()",
            returning = "result"
    )
    public void afterAdviceForDAOServiceAndController(JoinPoint joinPoint,Object result){
        logger.info("Method signature(after returning) : "+ joinPoint.getSignature().toShortString()+"\n");
        logger.info("Result : "+result);

    }
}
