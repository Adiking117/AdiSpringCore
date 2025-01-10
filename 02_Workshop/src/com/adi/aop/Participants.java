package com.adi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component // A class for which bean will be created
@Aspect // A single class which consists of pre and post processing
@EnableAspectJAutoProxy // To merge boiler plate code with business logic

public class Participants {

	// Method which has boilerplate and requires modularization 
	@Pointcut("execution(* *.train(..))")
	// Method in execution which comes from any class with any return type
	// with method name (train()) which has any number of arguments
	public void training() {}
	
//	@Before("training()")	// Advices
//	public void beforeTraining() {
//		System.out.println("PArticipants are taking seats");
//	}
//	
//	@After("training()")
//	public void afterTraining() {
//		System.out.println("Training Completed");
//	}
//	
//	@AfterReturning("training()")
//	public void afterReturning() {
//		System.out.println("Training was success");
//	}
//	
//	@AfterThrowing("training()")
//	public void afterThrowing() {
//		System.out.println("Training failed");
//	}
	
	@Around("training()")
	public void trainingInvocation(ProceedingJoinPoint pjp) {
		try {
			// @Before("training()")
			System.out.println("PArticipants are taking seats");
			
			// Containment and delegation
			// Delegating the call to business logic
			pjp.proceed();
			
			// @AfterReturning("training()")
			System.out.println("Training was success");
			
		} catch(Throwable e) {
			// @AfterThrowing("training()")
			System.out.println("Training failed");
		} finally {
			// @After("training()")
			System.out.println("Training Completed");
		}
	}
}
