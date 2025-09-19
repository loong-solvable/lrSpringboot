package com.powernode.springboot.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // 拦截service包下所有类的所有方法
    @Before("execution(* com.powernode.springboot.service..*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        // 获取目标类名
        String className = joinPoint.getTarget().getClass().getSimpleName();
        // 获取方法名
        String methodName = joinPoint.getSignature().getName();
        // 获取参数
        Object[] args = joinPoint.getArgs();

        // 构建日志信息
        StringBuilder logMessage = new StringBuilder();
        logMessage.append("即将执行方法: ").append(className).append(".").append(methodName).append("(");
        for (int i = 0; i < args.length; i++) {
            logMessage.append(args[i]);
            if (i < args.length - 1) {
                logMessage.append(", ");
            }
        }
        logMessage.append(")");

        logger.info(logMessage.toString());
    }
}