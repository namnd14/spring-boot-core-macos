package com.spring.core.dto.request;

import jakarta.validation.constraints.NotNull;

public class SortRequestDTO {
    @NotNull(message = "Order by field cannot be null")
    private String orderBy;

    @NotNull(message = "Direction cannot be null")
    private String direction;

    public SortRequestDTO(String orderBy, String direction) {
        this.orderBy = orderBy;
        this.direction = direction;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
