package com.marketplace.marketplace.dto.requestDto;

import com.marketplace.marketplace.models.Users;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.List;

public class ProductRequestDto {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private List<Long> userIds;


    public ProductRequestDto() {
    }

    public ProductRequestDto(Long id, String title, String description, BigDecimal price, List<Long> userIds) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.userIds = userIds;
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

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }
}
