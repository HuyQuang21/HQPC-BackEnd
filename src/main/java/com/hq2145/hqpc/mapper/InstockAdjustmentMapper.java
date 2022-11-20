package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.InstockAdjustmentDto;
import com.hq2145.hqpc.entity.InstockAdjustment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InstockAdjustmentMapper {
    InstockAdjustment dtoToEntity(InstockAdjustmentDto instockAdjustmentDto);
    InstockAdjustmentDto entityToDTO(InstockAdjustment instockAdjustment);
}
