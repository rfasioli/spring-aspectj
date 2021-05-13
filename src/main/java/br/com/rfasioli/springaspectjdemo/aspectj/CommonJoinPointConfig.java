package br.com.rfasioli.springaspectjdemo.aspectj;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* br.com.rfasioli.springaspectjdemo.repository.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* br.com.rfasioli.springaspectjdemo.service.*.*(..))")
    public void businessLayerExecution() {}

}
