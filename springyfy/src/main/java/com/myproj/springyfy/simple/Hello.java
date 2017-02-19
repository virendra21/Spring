package com.myproj.springyfy.simple;

//@Component
// @Scope("prototype")
public class Hello {

	private final String version;

	public Hello(String ver) {
		version = ver;
	}

	public void sayHello() {
		System.out.println("Hello Spring " + version);
	}
}