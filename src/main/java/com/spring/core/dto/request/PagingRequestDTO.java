package com.spring.core.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class PagingRequestDTO {
    @NotNull(message = "Page number cannot be null")
    @Min(value = 0, message = "Page number must be greater than or equal to 0")
    private Integer pageNumber;

    @NotNull(message = "Page size cannot be null")
    @Min(value = 1, message = "Page size must be greater than or equal to 1")
    private Integer pageSize;

    public PagingRequestDTO() {
        // Default constructor
    }

    public PagingRequestDTO(Integer pageNumber, Integer pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
