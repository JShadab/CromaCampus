package com.croma.springaopdemo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
public class AspectConfig {

	// PointCut Expression : accessModifier returnType
	// packageName.className.methodName(..)

//	@Before("execution (public * com.croma.springaopdemo.service.*.*(..))")
//	public void logBeforeAll(JoinPoint joinPoint) {
//
//		log.info(joinPoint.getSignature().getName() + " started...");
//
//	}

//	@After("execution (public * com.croma.springaopdemo.service.*.*(..))")
//	public void logAfterAll(JoinPoint joinPoint) {
//
//		log.info(joinPoint.getSignature().getName() + " ended...");
//
//	}

	@Around("execution (public * com.croma.springaopdemo.service.*.*(..))")
	public void logAroungAll(ProceedingJoinPoint joinPoint) throws Throwable  {

		log.info(joinPoint.getSignature().getName() + " started...");

		joinPoint.proceed();

		log.info(joinPoint.getSignature().getName() + " ended...");

	}
	
	@AfterReturning("execution (public * com.croma.springaopdemo.service.*.getAll())")
	public void logAfterReturning(JoinPoint joinPoint) {

		log.info(joinPoint.getSignature().getName() + " after reurning..");

	}

	@AfterThrowing("execution (public * com.croma.springaopdemo.service.*.getOne(..))")
	public void logAfterThrowing(JoinPoint joinPoint) {

		log.info(joinPoint.getSignature().getName() + " Some ERROR");

	}

}
