package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.example.demo.model.Department;

@Service
public class UserServiceRestClient {
    @Autowired
    private RestClient restClient;

    public Department getDepartment(Long id) {
        return restClient.get()
                .uri("http://localhost:8081/departments/{id}", id)
                .retrieve()
                .body(Department.class);
    }
}