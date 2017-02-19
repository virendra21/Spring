package com.myproj.springyfy.email;

import org.springframework.stereotype.Component;

@Component("mailgunVersion")
public class MailgunEmailService implements EmailService {

	@Override
	public void sendEmail(String to, String body) {
		System.out.println("Mailgun Email Service");
		System.out.println("Sending To: " + to);
		System.out.println("Message: " + body);
	}
}