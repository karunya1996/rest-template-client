package com.example.demo.model;

public class UserWithDepartment {
    private Long userId;
    private String userName;
    private Department department;

    // Constructors
    public UserWithDepartment() {}

    public UserWithDepartment(Long userId, String userName, Department department) {
        this.userId = userId;
        this.userName = userName;
        this.department = department;
    }

    // Getters & Setters
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}

