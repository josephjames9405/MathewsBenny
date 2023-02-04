package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		Student student = new Student();
		student.setFirstName("Joseph");
		student.setLastName("James");
		student.setId(1);
		
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getId());
		
	}
	

}
