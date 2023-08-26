package com.afs.restapi.service.dto;

import com.afs.restapi.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyRequest {
    private String name;

    public CompanyRequest(){
    }

    public CompanyRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
