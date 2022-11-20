package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.InstockAdjustmentDetail} entity
 */
@Data
public class InstockAdjustmentDetailDto implements Serializable {
    private Long id;
    private ProductDto product;
    private Integer quantity;
}