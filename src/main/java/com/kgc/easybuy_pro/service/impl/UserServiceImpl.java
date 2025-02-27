package com.kgc.easybuy_pro.service.impl;

import com.kgc.easybuy_pro.pojo.User;
import com.kgc.easybuy_pro.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User Login(String username, String password) {
        return null;
    }

    @Override
    public boolean Register(User user) {
        return false;
    }
}
