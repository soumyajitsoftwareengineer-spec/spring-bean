package com.spring.beansproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class JavaConfig {

	@Bean(name = "con")
	public Student getStudent()
	{
		System.out.println("Soumyajit");
		return new Student();
	}
}
