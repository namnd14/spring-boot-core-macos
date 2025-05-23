package com.spring.core.dto.request;

import jakarta.validation.constraints.NotNull;

public class PagingRequestDTO {
    @NotNull(message = "Page number cannot be null")
    private Integer pageNumber;

    @NotNull(message = "Page size cannot be null")
    private Integer pageSize;

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
