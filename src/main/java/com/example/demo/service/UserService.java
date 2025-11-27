package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;

@Service
public class UserService {

    @Autowired
    private DepartmentClient departmentClient;

    public UserWithDepartment getUserWithDepartment(Long userId) {
        Department dept = departmentClient.getDepartment(userId);
        return new UserWithDepartment(userId, "John", dept);
    }
}
