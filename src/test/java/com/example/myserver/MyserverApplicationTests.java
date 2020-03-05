package com.example.myserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootTest
class MyserverApplicationTests {
	@Test
	void contextLoads() {
        System.out.println("is conducted?");
	}

}
