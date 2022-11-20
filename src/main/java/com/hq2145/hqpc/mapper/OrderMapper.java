package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.OrderDto;
import com.hq2145.hqpc.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order dtoToEntity(OrderDto orderDto);
    OrderDto entityToDTO(Order order);
}
