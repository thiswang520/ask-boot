package com.ask.controller.service;
import com.ask.mapper.UserMapper;
import com.ask.model.User;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    @Autowired
    private UserMapper userMapper;

    public boolean register(User user) {
        user.setId(IdWorker.getId());
        // 根据邮箱查询是否已存在

        Integer insert = userMapper.insert(user);
        return insert > 0?true:false;
    }
}
