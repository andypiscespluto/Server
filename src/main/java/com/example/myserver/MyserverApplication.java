package com.example.myserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan
public class MyserverApplication {
	public static void main(String[] args) {
	    SpringApplication.run(MyserverApplication.class, args);
		System.out.println("conducted?");
	}
}
