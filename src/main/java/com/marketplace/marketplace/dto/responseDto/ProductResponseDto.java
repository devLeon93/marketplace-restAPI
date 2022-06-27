package com.marketplace.marketplace.dto.responseDto;

import com.marketplace.marketplace.models.Users;

import java.math.BigDecimal;
import java.util.List;

public class ProductResponseDto {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;



    public ProductResponseDto() {
    }

    public ProductResponseDto(Long id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
