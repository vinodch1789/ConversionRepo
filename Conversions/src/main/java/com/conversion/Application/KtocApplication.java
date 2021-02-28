package com.conversion.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"co.demo"})
public class KtocApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtocApplication.class, args);
	}

}
