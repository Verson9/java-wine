package com.sur_wis.wine_shop.model.mapper;

import com.sur_wis.wine_shop.model.dto.ProductDto;
import com.sur_wis.wine_shop.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto entityToDto(Product product);

    Product dtoToEntity(ProductDto dto);

    List<ProductDto> listedEntityToDto(List<Product> products);
}
