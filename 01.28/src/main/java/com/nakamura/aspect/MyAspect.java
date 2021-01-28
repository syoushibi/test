package com.nakamura.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
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
