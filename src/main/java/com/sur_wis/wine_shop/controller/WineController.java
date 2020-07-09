package com.sur_wis.wine_shop.controller;

import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.entity.WineEntity;
import com.sur_wis.wine_shop.model.mapper.WineMapper;
import com.sur_wis.wine_shop.model.repository.WineRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( path = "/wine" )
public class WineController {

    @Autowired
    WineRepository wineRepository;

    @PostMapping( path = "/addWine" )
    public @ResponseBody
    String addWine(@RequestParam String wineName,
                   @RequestParam String wineDescription,
                   @RequestParam String winePrice,
                   @RequestParam String wineColor,
                   @RequestParam String wineCountry,
                   @RequestParam String wineRegion,
                   @RequestParam String wineTaste,
                   @RequestParam String wineYear) {

        WineDto newWineDto = new WineDto(wineName, wineDescription, Integer.parseInt(winePrice), wineColor, wineCountry, wineRegion, wineTaste, Integer.parseInt(wineYear));
        WineEntity newWineEntity = WineMapper.INSTANCE.DtoToEntity(newWineDto);
        wineRepository.save(newWineEntity);

        return "----------Dodano wino----------";
    }

    @PostMapping( path = "/addWineFromDto" )
    public @ResponseBody
    String addWine(WineDto wineDto) {

        WineEntity newWineEntity = WineMapper.INSTANCE.DtoToEntity(wineDto);
        wineRepository.save(newWineEntity);

        return "----------Dodano wino----------";
    }

    @GetMapping( path = "/allWines" )
    public @ResponseBody
    List<WineEntity> getAllWines() {
        return wineRepository.findAll();
    }

    @GetMapping("/allWines/{id}")
    WineEntity getOneWine(@PathVariable Long id) throws NotFoundException {

        return wineRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id.toString()));
    }

    @PutMapping("/allWine/{id}")
    WineEntity replaceWine(@RequestBody WineEntity newWine, @PathVariable Long id) {

        return wineRepository.findById(id)
                .map(wineEntity -> {
                    wineEntity.setName(newWine.getName());
                    wineEntity.setDescription(newWine.getDescription());
                    wineEntity.setPrice(newWine.getPrice());
                    wineEntity.setColor(newWine.getColor());
                    wineEntity.setCountry(newWine.getCountry());
                    wineEntity.setRegion(newWine.getRegion());
                    wineEntity.setTasteType(newWine.getTasteType());
                    wineEntity.setYearOfProduction(newWine.getYearOfProduction());
                    return wineRepository.save(newWine);
                })
                .orElseGet(() -> {
                    newWine.setWineId(Math.toIntExact(id));
                    return wineRepository.save(newWine);
                });
    }

    @DeleteMapping("/allWines/{id}")
    void deleteEmployee(@PathVariable Long id) {
        wineRepository.deleteById(id);
    }
}
