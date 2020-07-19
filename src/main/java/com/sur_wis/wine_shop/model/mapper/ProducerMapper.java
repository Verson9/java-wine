package com.sur_wis.wine_shop.model.mapper;

import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.Wine;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProducerMapper {
    ProducerMapper INSTANCE = Mappers.getMapper(ProducerMapper.class);

    WineDto entityToDto(Wine wine);

    Wine dtoToEntity(WineDto dto);

    List<WineDto> listedEntityToDto(List<Wine> wines);
}
