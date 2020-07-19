package com.sur_wis.wine_shop.model.service;

import com.sur_wis.wine_shop.model.dto.AccessoryDto;
import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.Accessory;
import com.sur_wis.wine_shop.model.entity.Wine;
import com.sur_wis.wine_shop.model.mapper.AccessoryMapper;
import com.sur_wis.wine_shop.model.mapper.WineMapper;
import com.sur_wis.wine_shop.model.repository.AccessoriesRepository;
import com.sur_wis.wine_shop.model.repository.WinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableJpaRepositories
public class AccessoriesService {
    @Autowired
    private AccessoriesRepository accessoriesRepository;

    @Autowired
    private AccessoryMapper accessoryMapper;


    public AccessoryDto getOneAccessory(Long id) {
        Accessory accessory = accessoriesRepository.getOne(id);
        AccessoryDto accessoryDto = accessoryMapper.entityToDtoMapping(accessory);
        return accessoryDto;
    }

    public List<AccessoryDto> getAccessoriesList() {
        List<Accessory> accessories = accessoriesRepository.findAll();
        List<AccessoryDto> accessoryDtos = accessoryMapper.listOfEntityToDtoMapping(accessories);
        return accessoryDtos;
    }

    public void saveAccessory(AccessoryDto accessoryDto) {
        Accessory newAccessory = accessoryMapper.dtoToEntityMapping(accessoryDto);
        accessoriesRepository.save(newAccessory);
    }

    public AccessoryDto updateAccessory(Long id, AccessoryDto newAccessoryData) {
        AccessoryDto accessoryToUpdate = getOneAccessory(id);
        accessoryToUpdate.setName(newAccessoryData.getName());
        accessoryToUpdate.setDescription(newAccessoryData.getDescription());
        accessoryToUpdate.setType(newAccessoryData.getType());
        accessoryToUpdate.setPrice(newAccessoryData.getPrice());
        saveAccessory(accessoryToUpdate);
        return accessoryToUpdate;
    }

    public void deleteAccessory(long id) {
        accessoriesRepository.deleteById(id);
    }
}

