package com.kgc.easybuy_pro.service;

import com.kgc.easybuy_pro.pojo.User;

public interface UserService {
    User Login(String username,String password);
    boolean Register(User user);
}
