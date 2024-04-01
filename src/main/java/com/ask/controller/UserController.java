package com.ask.controller;

import com.ask.controller.service.UserService;
import com.ask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")

public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @return
     */
    @PostMapping("/register")
    public boolean register(@RequestBody User user){
        System.out.print("用户注册: {}"+ user);
        return userService.register(user);

    }

    /**
     * 用户登录
     * @return
     */
    @PostMapping("/login")
    public Map<String,String> login(@RequestBody User user){
        System.out.print("用户登录: {}"+ user);
        Map<String,String> maps = new HashMap();
        maps.put("code","0");
        maps.put("username","测试");
        maps.put("email","thiswangyang@163.com");
        return maps;

    }

}
