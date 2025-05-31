package com.spring.core.dto.request;

public class DemoForObjectMapper {
    private String name;

    private String description;

    public DemoForObjectMapper() {
    }

    public DemoForObjectMapper(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
