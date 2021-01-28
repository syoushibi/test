package com.nakamura.method;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("开始记录");
		Object invokeSuper = proxy.invokeSuper(obj, args);
		System.out.println("结束记录");
		return invokeSuper;
	}

}
