package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Department;

@Service
public class UserServiceRestTemplate {
    @Autowired private RestTemplate restTemplate;

    public Department getDepartment(Long id) {
        return restTemplate.getForObject(
            "http://localhost:8081/departments/{id}", Department.class, id);
    }
}