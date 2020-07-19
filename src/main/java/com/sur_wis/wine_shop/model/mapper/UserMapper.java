package com.sur_wis.wine_shop.model.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sur_wis.wine_shop.model.dto.UserDto;
import com.sur_wis.wine_shop.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {

    public User dtoToEntityMapping(UserDto userDto) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(mapper.writeValueAsString(userDto), User.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserDto entityToDtoMapping(User user) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(mapper.writeValueAsString(user), UserDto.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<UserDto> listOfEntityToDtoMapping(List<User> users) {
        List<UserDto> usersDto = new ArrayList<>();
        for (User u : users) {
            usersDto.add(entityToDtoMapping(u));
        }
        return usersDto;
    }

}
