package com.ricardortavares.netflix.eurekaclientnetflixoss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientNetflixOssApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientNetflixOssApplication.class, args);
	}

}
