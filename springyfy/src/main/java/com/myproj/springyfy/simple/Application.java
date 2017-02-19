package com.myproj.springyfy.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	public Hello asdfasdf() {
		return new Hello("4.5.RELEASE");
	}
}