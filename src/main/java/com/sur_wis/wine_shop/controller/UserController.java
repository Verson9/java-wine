package com.sur_wis.wine_shop.controller;

import com.sur_wis.wine_shop.model.dto.UserDto;
import com.sur_wis.wine_shop.model.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping(value = "/register")
    public String view() {
        return "registration-form";
    }

    @PostMapping(value = "/registerUser")
    public String register(@ModelAttribute UserDto userDto) {
        usersService.register(userDto);
        return "redirect:/register";
    }
}