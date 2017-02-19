package com.myproj.springyfy.email;

import org.springframework.stereotype.Component;

@Component("awsVersion")
public class AWSEmailService implements EmailService {

	@Override
	public void sendEmail(String to, String body) {
		System.out.println("AWS Email Service");
		System.out.println("Sending To: " + to);
		System.out.println("Message: " + body);
	}
}