package com.kash.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KashWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(KashWalletApplication.class, args);
	}

}
