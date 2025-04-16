package org.example.models;

import org.example.enums.Department;

public class People {
    private int id;
    private String fullName;
    private int age;
    private Department department;

    //create constructor

    public People(int id, String fullName, Department department, int age) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
