package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.Rating} entity
 */
@Data
public class RatingDto implements Serializable {
    private Long id;
    private ProductDto product;
    private UserDto customer;
    private OrderDto order;
    private Integer rated;
    private String detail;
}