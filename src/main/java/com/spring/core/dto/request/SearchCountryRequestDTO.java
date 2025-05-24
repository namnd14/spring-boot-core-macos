package com.spring.core.dto.request;

import jakarta.validation.constraints.NotNull;

public class SearchCountryRequestDTO extends PagingRequestDTO {
    @NotNull(message = "Order by field cannot be null")
    private String orderBy;

    @NotNull(message = "Direction cannot be null")
    private String direction;

    private String countryName;

    public SearchCountryRequestDTO() {
        // Default constructor
    }

    public SearchCountryRequestDTO(Integer pageNumber, Integer pageSize, String orderBy, String direction, String countryName) {
        super(pageNumber, pageSize);
        this.orderBy = orderBy;
        this.direction = direction;
        this.countryName = countryName;
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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
