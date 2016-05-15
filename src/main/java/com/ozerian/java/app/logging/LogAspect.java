package com.ozerian.java.app.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

    private static final Logger logger = Logger.getLogger(LogAspect.class);

    public Object methodsLog(ProceedingJoinPoint pjp) {
        PropertyConfigurator.configure("D:\\GoJavaOnlineHomeworks\\CalculatorApp\\src\\main\\resources\\log4j.properties");
        logger.info("Method <" + pjp.getTarget().getClass() + ">.<" + pjp.getSignature().getName() + "> is running");
        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            logger.error("ERROR! In method <" + pjp.getTarget().getClass() + ">.<" + pjp.getSignature().getName() + ">");
        }
        logger.info("Method <" + pjp.getTarget().getClass() + ">.<" + pjp.getSignature().getName() + "> stoped working");
        return result;
    }
}
