package com.rolling.purpleCompass.user.service;

import com.rolling.purpleCompass.user.dto.UserDto;
import com.rolling.purpleCompass.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService
{
    final private UserMapper usermapper;

    public void signUp(Map<String, Object> result){

        try{
            if(!result.get("password").equals(result.get("passwordConfirm"))) {
                System.out.println("비밀번호가 다름");
            }
            else {
                usermapper.signUp(result);
            }
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    };

    public UserDto signIn(Map<String, Object> result){
        UserDto user = usermapper.signIn(result);
        return user;
    };
}
