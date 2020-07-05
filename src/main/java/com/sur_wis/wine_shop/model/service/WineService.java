package com.sur_wis.wine_shop.model.service;

import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.WineEntity;
import com.sur_wis.wine_shop.model.mapper.WineMapper;
import com.sur_wis.wine_shop.model.repository.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WineService {
    private WineRepository wineRepository;

    @Autowired
    public WineService(WineRepository wineRepository){
        this.wineRepository = wineRepository;}

    public List<WineDto> getAllWinesDto() {
        List<WineEntity> wineEntities = wineRepository.getAll();
        return WineMapper.INSTANCE.entityToDtoList(wineEntities);
    }

    public  void saveWine(WineDto wineDto){
        WineEntity wineEntity = WineMapper.INSTANCE.DtoToEntity(wineDto);
        wineRepository.save(wineEntity);
    }

    public void deleteWineById(Integer id){
        wineRepository.deleteById(id.longValue());
    }
}
