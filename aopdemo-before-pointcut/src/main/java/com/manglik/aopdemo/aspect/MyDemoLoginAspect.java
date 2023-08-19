package com.manglik.aopdemo.aspect;

import com.manglik.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {

    @Before("com.manglik.aopdemo.aspect.LuvAOPExpression.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n =====> Executing @Before advice on method");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method sign "+ methodSignature);

        Object[] args = joinPoint.getArgs();
        for(Object ob: args){
            System.out.println(ob);
            if (ob instanceof Account){
                Account account = (Account) ob;
                System.out.println( account.getName());
            }
        }
     }
}


