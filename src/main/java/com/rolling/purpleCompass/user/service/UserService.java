package com.rolling.purpleCompass.user.service;

import com.rolling.purpleCompass.user.dto.UserDto;

import java.util.Map;

public interface UserService
{
    public void signUp(Map<String, Object> result);
    public UserDto signIn(Map<String, Object> result);
}
