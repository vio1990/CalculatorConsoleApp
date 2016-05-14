package com.ozerian.java.app.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

    private static final Logger logger = Logger.getLogger(LogAspect.class);

    public Object methodsLog(ProceedingJoinPoint pjp) throws Throwable {
        PropertyConfigurator.configure("D:\\GoJavaOnlineHomeworks\\CalculatorApp\\src\\main\\resources\\log4j.properties");
        logger.info("Method " + pjp.getSignature().getName() + " is running");
        Object result = pjp.proceed();
        logger.info("Method " + pjp.getSignature().getName() + " stop working");
        return result;
    }
}
