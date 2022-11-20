package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.Supplier} entity
 */
@Data
public class SupplierDto implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String address;
    private String phone;
}