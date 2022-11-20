package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.ProductCategoryDto;
import com.hq2145.hqpc.entity.ProductCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    ProductCategory dtoToEntity(ProductCategoryDto productCategoryDto);
    ProductCategoryDto entityToDTO(ProductCategory productCategory);
}
