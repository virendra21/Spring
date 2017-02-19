package com.myproj.springyfy.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		Hello hello = context.getBean(Hello.class);
		hello.sayHello();

		Hello hello1 = context.getBean(Hello.class);
		System.out.println(hello == hello1);
		context.close();
	}
}