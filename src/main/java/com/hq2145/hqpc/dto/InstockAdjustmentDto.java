package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.InstockAdjustment} entity
 */
@Data
public class InstockAdjustmentDto implements Serializable {
    private Long id;
    private String type;
    private String code;
    private SupplierDto supplier;
    private String createdBy;
    private LocalDateTime createdDate;
    private List<InstockAdjustmentDetailDto> instockAdjustmentDetails;
}