package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.OrderDetailDto;
import com.hq2145.hqpc.entity.OrderDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDetailMapper {
    OrderDetail dtoToEntity(OrderDetailDto orderDetailDto);
    OrderDetailDto entityToDTO(OrderDetail orderDetail);
}
