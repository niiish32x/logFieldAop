package org.niiish32x.logfieldaop.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Slf4j
public class LogFieldAsp {

    @Pointcut("@annotation(org.niiish32x.logfieldaop.aspect.annotation.LogFieldAsp)")
    public void aspect() {

    }

    /**
     * 前处理 获取 类class 的基本信息
     * @param joinPoint
     */
    @Before(value = "aspect()")
    public void before(JoinPoint joinPoint) {

    }

}
