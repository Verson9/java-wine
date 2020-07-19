package com.sur_wis.wine_shop.controller;

import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.service.WinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WineController {

    @Autowired
    private WinesService winesService;

    @GetMapping( "/showWines" )
    public String showProducts(Model model) {
        List<WineDto> products = winesService.getWinesList();
        model.addAttribute("/showWines", products);
        return "/showWines";
    }

    @GetMapping( "/showWines/{id}" )
    public String showProductsById(Model model, @PathVariable Long id) {
        WineDto product = winesService.getOneWine(id);
        model.addAttribute("/showWines", product);
        return "/showWines";
    }

    @GetMapping( "/addWine" )
    public String create(@ModelAttribute WineDto wineDto) {
        winesService.saveWine(wineDto);
        return "redirect:/showWines";
    }

    @PutMapping( "/updateWine/{id}" )
    public String update(@ModelAttribute WineDto oldWine, @ModelAttribute WineDto newWine) {
        winesService.updateWine(oldWine.getId(), newWine);
        return "redirect:/showWines";
    }

    @DeleteMapping( "/deleteWine/{id}" )
    public String delete(@ModelAttribute WineDto wine) {
        winesService.deleteProduct(wine.getId());
        return "/showWines";
    }
}
