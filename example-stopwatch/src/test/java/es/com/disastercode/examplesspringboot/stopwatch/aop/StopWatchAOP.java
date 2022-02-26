package es.com.disastercode.examplesspringboot.stopwatch.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component  
public class StopWatchAOP {
	
    @Around("execution(* es.com.disastercode.examplesspringboot.stopwatch.service.*.*(..))")
    public Object measureMethod(ProceedingJoinPoint pjp) throws Throwable
    {
        StopWatch sw = new StopWatch();
        Object retVal;
        try {
            sw.start(pjp.getTarget()+"."+pjp.getSignature());
            retVal = pjp.proceed();
        } catch (Throwable e) {
            throw e;
        } finally {
            sw.stop();
            System.out.println(sw.prettyPrint());
        }
        return retVal;
    }
}
