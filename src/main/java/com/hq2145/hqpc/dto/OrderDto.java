package com.hq2145.hqpc.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * A DTO for the {@link com.hq2145.hqpc.entity.Order} entity
 */
@Data
public class OrderDto implements Serializable {
    private Long id;
    private String code;
    private UserDto customer;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String note;
    private String status;
    private LocalDateTime createdDate;
    private String displayCreatedDate;
    public String getDisplayCreatedDate() {
        if (createdDate != null) {
            return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(createdDate);
        } else {
            return null;
        }
    }

    private List<OrderDetailDto> orderDetails;
}