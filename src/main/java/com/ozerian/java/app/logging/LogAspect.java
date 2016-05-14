package com.ozerian.java.app.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAspect {

    static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    public Object methodsLog(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("Method " + pjp.getSignature().getName() + " is running");
        Object result = pjp.proceed();
        logger.info("Method " + pjp.getSignature().getName() + " stop working");
        return result;
    }
}
