package com.example.eurekaconsumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*@EnableCircuitBreaker//开启Hystrix使用
@EnableDiscoveryClient
@SpringBootApplication*/
@SpringCloudApplication
public class ConsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerHystrixApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
