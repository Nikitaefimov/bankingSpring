package com.bankingSpring.bankingSpring.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    public List<Client> getClients() {
        return List.of(new Client(1L, "name", 123L, "Male"));
    }
}
