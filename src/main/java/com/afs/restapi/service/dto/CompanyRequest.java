package com.afs.restapi.service.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class CompanyRequest {
    private final String name;

    @JsonCreator
    public CompanyRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
