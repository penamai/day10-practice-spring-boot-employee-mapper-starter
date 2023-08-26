package com.afs.restapi.service.dto;

public class CompanyResponse {
    private Long id;
    private String name;
    private Integer employeesCount;

    public CompanyResponse(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }
}
