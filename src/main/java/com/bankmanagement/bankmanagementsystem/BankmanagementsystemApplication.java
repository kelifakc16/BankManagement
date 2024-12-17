package com.bankmanagement.bankmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.bankmanagement.bankmanagementsystem.repository")
//@EntityScan(basePackages = "com.bankmanagement.bankmanagementsystem.model")
public class BankmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankmanagementsystemApplication.class, args);
	}

}
