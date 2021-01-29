package com.test.testprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestProvider2Application.class, args);
	}

}
