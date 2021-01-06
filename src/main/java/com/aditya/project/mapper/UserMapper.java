package com.aditya.project.mapper;

import com.aditya.project.dto.UserDto;
import com.aditya.project.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserDto userDto);

    UserDto map(User user);
}
