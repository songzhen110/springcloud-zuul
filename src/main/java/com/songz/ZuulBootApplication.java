package com.songz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulBootApplication.class, args);
	}
}
