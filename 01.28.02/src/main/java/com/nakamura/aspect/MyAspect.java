package com.nakamura.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	@Before("execution(* *..*.*ServiceImpl.add*(..))")
	public void startLog() {
		System.out.println("开始记录时间");
	}
	public void commitLog() {
		System.out.println("记录时间");
	}
	public void loggin(ProceedingJoinPoint joinPoint) {
		System.out.println("开启记录时间");
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("记录时间");
	}
}
