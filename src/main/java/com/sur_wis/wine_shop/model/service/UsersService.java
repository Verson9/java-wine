package com.sur_wis.wine_shop.model.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sur_wis.wine_shop.model.dto.RegisterUser;
import com.sur_wis.wine_shop.model.entity.Users;
import com.sur_wis.wine_shop.model.repository.UsersRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void register(RegisterUser registerUser) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Users user = mapper.readValue(mapper.writeValueAsString(registerUser), Users.class);
            usersRepository.save(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
