package br.com.rfasioli.springaspectjdemo.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Before(value = "br.com.rfasioli.springaspectjdemo.aspectj.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        logger.info("before execution of {}", joinPoint);
    }

}
