package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.UserServiceRestClient;
import com.example.demo.service.UserServiceRestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceRestTemplate userServiceRestTemplate;
    @Autowired 
    private UserServiceRestClient userServiceRestClient;

    @GetMapping("/resttemplate/{id}")
    public Department getDeptWithRestTemplate(@PathVariable Long id) {
        return userServiceRestTemplate.getDepartment(id);
    }

    @GetMapping("/restclient/{id}")
    public Department getDeptWithRestClient(@PathVariable Long id) {
        return userServiceRestClient.getDepartment(id);
    }
}