package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.OrderDetail} entity
 */
@Data
public class OrderDetailDto implements Serializable {
    private Long id;
    private ProductDto product;
    private Integer quantity;
    private Integer sellPrice;
    private float sellDiscount;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}