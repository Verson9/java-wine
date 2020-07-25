package com.sur_wis.wine_shop.model.service;

import com.sur_wis.wine_shop.model.dto.UserDto;
import com.sur_wis.wine_shop.model.entity.User;
import com.sur_wis.wine_shop.model.mapper.UserMapper;
import com.sur_wis.wine_shop.model.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UserMapper userMapper;


    public void register(UserDto userDto) {
        User user = userMapper.dtoToEntityMapping(userDto);
        usersRepository.save(user);
    }

    public UserDto login(UserDto userDto){
        User user = usersRepository.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
        return userMapper.entityToDtoMapping(user);
    }
}
