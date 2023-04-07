package com.aop.aspects;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


//AOP
@Configuration
@Aspect
public class AopAspects {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//PointCut when
	
	@Before("execution(* com.aop.*.*(..))")
	public void logMethodCall(JoinPoint joinPoint) {
		logger.info("this method is called...{}",joinPoint);
		
		// logic 
		
	}
	
	
	

}
