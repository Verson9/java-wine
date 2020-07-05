package com.sur_wis.wine_shop.model.mapper;


import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.WineEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface WineMapper {
    static WineMapper INSTANCE = Mappers.getMapper(WineMapper.class);

    WineDto entityToDto(WineEntity wineEntity);
    List<WineDto> entityToDtoList(List<WineEntity>wines);
    WineEntity DtoToEntity(WineDto wineDto);
}
