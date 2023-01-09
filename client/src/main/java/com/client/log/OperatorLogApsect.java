package com.client.log;

import com.client.auth.ResponseResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 操作日志切面定义
 */
@Aspect
@Component
public class OperatorLogApsect {

    private static Logger logger = LogManager.getLogger(OperatorLogApsect.class);

    @Pointcut("@annotation(com.client.log.OperatorLog)")
    public void operatorLog() {

    }

    @SuppressWarnings("rawtypes")
    @AfterReturning(returning="result", pointcut="operatorLog()&&@annotation(log)")
    public void afterReturn(JoinPoint joinPoint, ResponseResult result, OperatorLog log) {

        /**
         * 接口调用信息可以记日志，也可以写到数据库
         */
        StringBuilder sb = new StringBuilder();
        sb.append("模块：").append(log.module());
        sb.append("|操作:").append(log.operate());
        sb.append("|接口名称:").append(joinPoint.getSignature().getName());
        sb.append("|错误码:").append(result.getCode());
        sb.append("|错误信息:").append(result.getMsg());
        logger.info(sb.toString());
    }
}
 