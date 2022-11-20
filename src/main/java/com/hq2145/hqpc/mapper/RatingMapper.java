package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.SupplierDto;
import com.hq2145.hqpc.entity.Supplier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingMapper {
    Supplier dtoToEntity(SupplierDto supplierDto);
    SupplierDto entityToDTO(Supplier supplier);
}
