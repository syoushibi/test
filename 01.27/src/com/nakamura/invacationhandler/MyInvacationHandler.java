package com.nakamura.invacationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.nakamura.service.StudentService;

public class MyInvacationHandler implements InvocationHandler{
	private StudentService service;
	public MyInvacationHandler(StudentService service) {
		this.service = service;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开启记录时间");
		method.invoke(service);
		System.out.println("提交记录时间");
		return null;
	}

}
