package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.Product} entity
 */
@Data
public class ProductDto implements Serializable {
    private Long id;
    private String name;
    private String code;
    private int price;
    private float discount;
    private int warranty;
    private ProductCategoryDto category;
    private boolean status;
    private String detail;
    private String info;
    private String avatar;
    private String images;
    private String createdBy;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedBy;
    private LocalDateTime modifiedDate;

    private String displayCreatedDate;
    public String getDisplayCreatedDate() {
        if (createdDate != null) {
            return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(createdDate);
        } else {
            return null;
        }
    }

    private String displayModifiedDate;
    public String getDisplayModifiedDate() {
        if (modifiedDate != null) {
            return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(modifiedDate);
        } else {
            return null;
        }
    }
}