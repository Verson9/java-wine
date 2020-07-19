package com.sur_wis.wine_shop.controller;

import com.sur_wis.wine_shop.model.dto.AccessoryDto;
import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.service.AccessoriesService;
import com.sur_wis.wine_shop.model.service.WinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AccessoryController {
    @Autowired
    private AccessoriesService accessoriesService;

    @GetMapping( "/showAccessories" )
    public String showAccessories(Model model) {
        List<AccessoryDto> accessoryDtos = accessoriesService.getAccessoriesList();
        model.addAttribute("showProducts", accessoryDtos);
        return "redirect:/showAccessories";
    }

    @GetMapping( "/showAccessories/{id}" )
    public String showAccessoryById(Model model, @PathVariable Long id) {
        AccessoryDto accessory = accessoriesService.getOneAccessory(id);
        model.addAttribute("showProducts", accessory);
        return "redirect:/showAccessories";
    }

    @GetMapping( "/addAccessory" )
    public String createAccessory(@ModelAttribute AccessoryDto accessoryDto) {
        accessoriesService.saveAccessory(accessoryDto);
        return "redirect:/showAccessories";
    }

    @PutMapping( "/updateAccessory/{id}" )
    public String updateAccessory(@ModelAttribute AccessoryDto oldAccessory, @ModelAttribute AccessoryDto newAccessory) {
        accessoriesService.updateAccessory(oldAccessory.getId(), newAccessory);
        return "redirect:/showAccessories";
    }

    @DeleteMapping( "/deleteAccessory/{id}" )
    public String deleteAccessory(@ModelAttribute AccessoryDto accessoryDto) {
        accessoriesService.deleteAccessory(accessoryDto.getId());
        return "redirect:/showAccessories";
    }
}
