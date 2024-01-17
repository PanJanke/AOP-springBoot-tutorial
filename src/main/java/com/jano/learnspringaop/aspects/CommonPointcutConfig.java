package com.jano.learnspringaop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.jano.learnspringaop.*.*.*(..))")
    public void businessAndDataPackageConfig() {}

    @Pointcut("execution(* com.jano.learnspringaop.business.*.*(..))")
    public void businessPackageConfig() {}

    @Pointcut("execution(* com.jano.learnspringaop.data.*.*(..))")
    public void dataPackageConfig() {}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {}

}