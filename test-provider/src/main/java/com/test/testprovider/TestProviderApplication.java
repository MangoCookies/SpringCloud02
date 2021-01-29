package com.test.testprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
@EnableEurekaClient
public class TestProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProviderApplication.class, args);
	}

}
