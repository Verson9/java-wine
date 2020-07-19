package com.sur_wis.wine_shop.model.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sur_wis.wine_shop.model.dto.AccessoryDto;
import com.sur_wis.wine_shop.model.entity.Accessory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccessoryMapper {

    public Accessory dtoToEntityMapping(AccessoryDto accessoryDto) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(mapper.writeValueAsString(accessoryDto), Accessory.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public AccessoryDto entityToDtoMapping(Accessory accessory) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(mapper.writeValueAsString(accessory), AccessoryDto.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<AccessoryDto> listOfEntityToDtoMapping(List<Accessory> accessories) {
        List<AccessoryDto> accessoryDtos = new ArrayList<>();
        for (Accessory accessory : accessories) {
            accessoryDtos.add(entityToDtoMapping(accessory));
        }
        return accessoryDtos;
    }
}
