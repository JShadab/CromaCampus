package com.croma.springaopdemo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
public class AspectConfig {

	// PointCut Expression : accessModifier returnType
	// packageName.className.methodName(..)

	@Before("execution (public * com.croma.springaopdemo.service.*.*(..))")
	public void logBeforeAll(JoinPoint joinPoint) {

		log.info(joinPoint.getSignature().getName() + " started...");

	}

	@After("execution (public * com.croma.springaopdemo.service.*.*(..))")
	public void logAfterAll(JoinPoint joinPoint) {

		log.info(joinPoint.getSignature().getName() + " ended...");

	}

}
