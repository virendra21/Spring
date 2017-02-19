package com.myproj.springyfy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.myproj.springyfy.email.EmailService;

@Component
public class NotificationService {

	// property based DI
	@Autowired
	@Qualifier("mailgunVersion")
	private EmailService emailService;

	// contructor based DI
	// @Autowired
	// public NotificationService(EmailService emailService) {
	// this.emailService = emailService;
	// }

	public void sendNotification(String to, String msg) {
		emailService.sendEmail(to, msg);
	}
}
