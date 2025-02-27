package com.kgc.easybuy_pro.mapper;

import com.kgc.easybuy_pro.pojo.User;

public interface UserMapper {
    int insertUser(User user);
    User getUser();
}
