package com.sur_wis.wine_shop.model.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.Wine;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WineMapper {

    public Wine dtoToEntityMapping(WineDto wineDto) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(mapper.writeValueAsString(wineDto), Wine.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WineDto entityToDtoMapping(Wine wine) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(mapper.writeValueAsString(wine), WineDto.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<WineDto> listOfEntityToDtoMapping(List<Wine> wines) {
        List<WineDto> usersDto = new ArrayList<>();
        for (Wine w : wines) {
            usersDto.add(entityToDtoMapping(w));
        }
        return usersDto;
    }
}
