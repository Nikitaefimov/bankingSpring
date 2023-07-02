package com.bankingSpring.bankingSpring.Client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
        return args -> {
            Client Bob = new Client("Bob", 12L, "Male");
            Client Mel = new Client("Mel", 15L, "Female");
            clientRepository.saveAll(List.of(Bob, Mel));
        };
    }
}
