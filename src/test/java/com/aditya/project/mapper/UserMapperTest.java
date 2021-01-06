package com.aditya.project.mapper;

import com.aditya.project.dto.UserDto;
import com.aditya.project.model.User;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserMapperTest {

    private static final String NAME = "Aditya";
    private static final int AGE = 25;

    @InjectMocks
    private UserMapperImpl userMapper;

    private static User givenUser() {
        User user = new User();
        user.setName(NAME);
        user.setAge(AGE);
        return user;
    }

    private static UserDto givenUserDto() {
        UserDto userDto = new UserDto();
        userDto.setName(NAME);
        userDto.setAge(AGE);
        return userDto;
    }

    @Test
    public void should_map_user_to_userDto() {
        // Given
        User user = givenUser();
        // When
        UserDto userDto = userMapper.map(user);
        // Then
        assertThat(userDto).isNotNull();
        assertThat(userDto.getName()).isEqualTo(NAME);
        assertThat(userDto.getAge()).isEqualTo(AGE);
    }

    @Test
    public void should_map_userDto_to_user() {
        // Given
        UserDto userDto = givenUserDto();
        // When
        User user = userMapper.map(userDto);
        // Then
        assertThat(user).isNotNull();
        assertThat(user.getName()).isEqualTo(NAME);
        assertThat(user.getAge()).isEqualTo(AGE);
    }
}
