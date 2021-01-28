package com.nakamura.test;

import org.junit.Test;

import com.nakamura.method.MyMethodInterceptor;
import com.nakamura.student.Student;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class MyTest {
	@Test
	public void demo() {
		//生成动态代理类。且在指定目录下
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\workspace");
		//创建Enhancer对象 相当于proxy对象
		Enhancer enhancer = new Enhancer();
		//设置参数
		enhancer.setSuperclass(Student.class);
		enhancer.setCallback(new MyMethodInterceptor());
		//正式创建代理类,但它的本质还是Student
		Student stu = (Student) enhancer.create();
		stu.show();
	}
	
}
