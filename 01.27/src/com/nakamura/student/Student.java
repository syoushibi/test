package com.nakamura.student;

public class Student {
	public int age = 33;
	private String name = "中村伦也";
	
	public Student() {
		System.out.println("我是无参构造方法");
	}
	public Student(int i) {
		System.out.println("我是有参构造方法"+i);
	}
	public void student() {
		System.out.println("我是公共的普通方法");
	}
	private void student1(int i) {
		System.out.println("我是私有的普通方法"+i);
	}

}
