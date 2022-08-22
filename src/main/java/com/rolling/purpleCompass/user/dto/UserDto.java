package com.rolling.purpleCompass.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private String id;
    private String nickname;
    private String email;
    private String password;
    private String[] issueList;
    private int admin;
    private Date joinDate;
    private String[] projectList;
    private String profileImage;
}
