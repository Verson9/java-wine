package com.sur_wis.wine_shop.model.service;

import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.Wine;
import com.sur_wis.wine_shop.model.mapper.WineMapper;
import com.sur_wis.wine_shop.model.repository.WinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableJpaRepositories
public class WinesService {

    @Autowired
    private WinesRepository winesRepository;

    @Autowired
    private WineMapper wineMapper;


    public WineDto getOneWine(Long id) {
        Wine wine = winesRepository.getOne(id);
        WineDto wineDto = wineMapper.entityToDtoMapping(wine);
        return wineDto;
    }

    public List<WineDto> getWinesList() {
        List<Wine> wines = winesRepository.findAll();
        List<WineDto> wineDtos = wineMapper.listOfEntityToDtoMapping(wines);
        return wineDtos;
    }

    public void saveWine(WineDto wineDto) {
        Wine newWine = wineMapper.dtoToEntityMapping(wineDto);
        winesRepository.save(newWine);
    }

    public WineDto updateWine(Long id, WineDto newWineData) {
        Wine wineToUpdate = winesRepository.getOne(id);
        wineToUpdate.setName(newWineData.getName());
        wineToUpdate.setDescription(newWineData.getDescription());
        wineToUpdate.setRegion(newWineData.getRegion());
        wineToUpdate.setCountry(newWineData.getCountry());
        wineToUpdate.setPrice(newWineData.getPrice());
        winesRepository.save(wineToUpdate);
        return wineMapper.entityToDtoMapping(wineToUpdate);
    }

    public void deleteProduct(long id) {
        winesRepository.deleteById(id);
    }
}
