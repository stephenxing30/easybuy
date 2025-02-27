package com.kgc.easybuy_pro.controller;

import com.kgc.easybuy_pro.pojo.User;
import com.kgc.easybuy_pro.service.UserService;
import com.kgc.easybuy_pro.util.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResponseMsg login(String username,String password){
        ResponseMsg msg = new ResponseMsg();
        User loginUser = userService.Login(username, password);
        if(loginUser==null){
            msg.setCode("301");
            msg.setData(loginUser);
        }else{
            msg.setCode("200");//登录成功
            msg.setData(loginUser);
        }
        return  msg;
    }
}
