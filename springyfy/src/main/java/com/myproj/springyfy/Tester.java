package com.myproj.springyfy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		NotificationService service = context.getBean(NotificationService.class);
		service.sendNotification("psalitra@egen.io", "It's too late...");
		context.close();
	}
}