package com.models;

public class Student {
    private int id;
    private String phone;
    private String name;
    private String gender;
    private String address;
    private String username;
    private String password;

    // Default constructor
    public Student() {
    }

    // Overloaded constructor
    public Student(int id, String phone, String name, String gender, String address, String username, String password) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    // Getters and setters for each field
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
