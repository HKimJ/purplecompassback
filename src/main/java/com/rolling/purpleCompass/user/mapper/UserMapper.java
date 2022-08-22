package com.rolling.purpleCompass.user.mapper;

import com.rolling.purpleCompass.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper
{
    void signUp(Map result);
    UserDto signIn(Map result);
}
