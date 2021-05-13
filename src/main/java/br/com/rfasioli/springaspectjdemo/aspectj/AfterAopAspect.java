package br.com.rfasioli.springaspectjdemo.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "execution(* br.com.rfasioli.springaspectjdemo.service.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @After(value = "execution(* br.com.rfasioli.springaspectjdemo.service.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }

    @After(value = "execution(*.new())")
    public void afterConstructor(JoinPoint joinPoint) {
        logger.info("after creation of {}", joinPoint);
    }
}
