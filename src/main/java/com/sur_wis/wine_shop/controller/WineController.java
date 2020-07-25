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
    public String showWines(Model model) {
        List<WineDto> winesList = winesService.getWinesList();
        model.addAttribute("showWines", winesList);
        return "/wine/show-wines";
    }

    @PostMapping( "/showWines/{id}" )
    public String showWineById(Model model, @PathVariable Long id) {
        WineDto product = winesService.getOneWine(id);
        model.addAttribute("/showWines", product);
        return "/wine/show-wines";
    }

    @GetMapping("/addWineForm")
    public String addAccessory() {
        return "/wine/add-wine-form";
    }

    @GetMapping( "/addWine" )
    public String createWine(@ModelAttribute WineDto wineDto) {
        winesService.saveWine(wineDto);
        return "/wine/show-wines";
    }
    @PostMapping("/updateWineForm")
    public String updateWineForm(Model model, @ModelAttribute WineDto oldWine){
        model.addAttribute("oldWine", oldWine);
        return "/wine/update-wine-form";
    }

    @PutMapping( "/updateWine/{id}" )
    public String updateWine(@ModelAttribute WineDto oldWine, @ModelAttribute WineDto newWine) {
        winesService.updateWine(oldWine.getId(), newWine);
        return "redirect:";
    }

    @DeleteMapping( "/deleteWine/{id}" )
    public String deleteWine(@PathVariable Long id) {
        winesService.deleteProduct(id);
        return "redirect:";
    }
}
