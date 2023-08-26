package com.afs.restapi.service.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class EmployeeRequest {
    private final String name;
    private final Integer age;
    private final String gender;
    private final Integer salary;

    @JsonCreator
    public EmployeeRequest(String name, Integer age, String gender, Integer salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getSalary() {
        return salary;
    }

}
