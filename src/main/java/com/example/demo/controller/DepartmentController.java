package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Long id) {
        return new Department(id, "HR", "Bangalore");
    }
    

        @GetMapping("/{id}")
        public Department getDepartment2(@PathVariable Long id) {
            // For demo purposes, returning static data
            if (id == 1) {
                return new Department(1L, "HR", "Bangalore");
            } else if (id == 2) {
                return new Department(2L, "Finance", "Mumbai");
            } else {
                return new Department(id, "Unknown", "Unknown");
            }
        }
}
