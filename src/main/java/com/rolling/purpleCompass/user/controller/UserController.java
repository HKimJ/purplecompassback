package com.rolling.purpleCompass.user.controller;

import com.rolling.purpleCompass.user.dto.UserDto;
import com.rolling.purpleCompass.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController
{
    final UserService userService;

    @ResponseBody
    @PostMapping("/signIn")
    public UserDto signIn(@RequestBody Map<String, Object> map)
    {
        Map<String, Object> result = map;
        return userService.signIn(result);
    }

    @ResponseBody
    @PostMapping("/signUp")
    public void signUp(@RequestBody Map<String, Object> map)
    {
        Map<String, Object> result = map;
        userService.signUp(result);
    }

}
