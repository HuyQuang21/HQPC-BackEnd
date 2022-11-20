package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.ProductCategory} entity
 */
@Data
public class ProductCategoryDto implements Serializable {
    private Long id;
    private String name;
    private String code;
    private boolean status;
}