package com.bankingSpring.bankingSpring;

import com.bankingSpring.bankingSpring.Client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class BankingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingSpringApplication.class, args);
	}
}
