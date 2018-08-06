package org.lhyf.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.lhyf.cache.annotation.Cached;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/****
 * @author YF
 * @date 2018-08-04 17:46
 * @desc TestAspectj
 *
 **/
@Component
@Aspect
public class TestAspectj {
    @AfterReturning("@annotation(org.lhyf.cache.annotation.Cached)")
    private void process(JoinPoint joinPoint) {
        System.out.println("============================================");
    }
}
