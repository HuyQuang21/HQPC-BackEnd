package com.hq2145.hqpc.mapper;

import com.hq2145.hqpc.dto.ProductDto;
import com.hq2145.hqpc.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product dtoToEntity(ProductDto productDto);
    ProductDto entityToDTO(Product product);
}
