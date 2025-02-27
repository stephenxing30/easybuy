package com.kgc.easybuy_pro.service.impl;

import com.kgc.easybuy_pro.mapper.UserMapper;
import com.kgc.easybuy_pro.pojo.User;
import com.kgc.easybuy_pro.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public User Login(String username, String password) {
        User user = userMapper.getUser(username);
        if(user==null){
            return null;
        }
        if(!user.getPassword().equals(password)){
            return null;
        }
        return user;
    }

    @Override
    public boolean Register(User user) {
        int insertCount = userMapper.insertUser(user);
        if(insertCount>0){
            return true;
        }
        return false;
    }
}
