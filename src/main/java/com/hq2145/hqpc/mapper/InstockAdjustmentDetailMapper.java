package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.InstockAdjustmentDetailDto;
import com.hq2145.hqpc.entity.InstockAdjustmentDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InstockAdjustmentDetailMapper {
    InstockAdjustmentDetail dtoToEntity(InstockAdjustmentDetailDto instockAdjustmentDto);
    InstockAdjustmentDetailDto entityToDTO(InstockAdjustmentDetail instockAdjustment);
}
