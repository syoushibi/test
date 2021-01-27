package com.nakamura.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.lang.model.type.DeclaredType;

import org.junit.Test;

import com.nakamura.invacationhandler.MyInvacationHandler;
import com.nakamura.service.StudentService;
import com.nakamura.service.impl.StudentServiceImpl;

public class MyTest {
	@Test
	public void demo() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		//得到类对象  这里就是得到的学生类对象
		Class studentClass = Class.forName("com.nakamura.student.Student");
		//这里Object newInstance= 就相当于 Student s = 
		Object newInstance = studentClass.newInstance();
		//通过属性名获取属性值
		Field field = studentClass.getField("age");
		                     //field表示是newInstance这个对象里面的属性
		                     //field.getInt(newInstance)这个就表示对象中field属性的值
		System.out.println(field.getInt(newInstance));
		
		//访问私有属性
		Field field2 = studentClass.getDeclaredField("name");
		//对属性设置访问权限。
		field2.setAccessible(true);
		System.out.println(field2.get(newInstance));
	}
	@Test
	public void demo2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class studentClass = Class.forName("com.nakamura.student.Student");
		//得到真正的学生对象
		Object newInstance = studentClass.newInstance();
		Method method = studentClass.getMethod("student");
		method.invoke(newInstance);
	}
	@Test
	public void demo3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class studentClass = Class.forName("com.nakamura.student.Student");
		Object newInstance = studentClass.newInstance();
		Method method = studentClass.getDeclaredMethod("student1", int.class);
		method.setAccessible(true);
		method.invoke(newInstance, 33);
	}
	@Test
	public void demo4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class studentClass = Class.forName("com.nakamura.student.Student");
		Constructor con = studentClass.getConstructor(int.class);
		Object newInstance = con.newInstance(33);
//		System.out.println(newInstance);
		
	}
	@Test
	public void demo5() {
		StudentService service = new StudentServiceImpl();
		                 //动态代理对象
		StudentService  newProxyInstance = (StudentService) Proxy.newProxyInstance( service.getClass().getClassLoader(),  
				service.getClass().getInterfaces(), 
				new MyInvacationHandler(service));
		//newProxyInstance的本质还是studentService
		newProxyInstance.addStudent();
	}
}
