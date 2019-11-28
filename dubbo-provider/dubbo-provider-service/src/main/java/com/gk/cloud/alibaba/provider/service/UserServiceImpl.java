package com.gk.cloud.alibaba.provider.service;

import com.gk.cloud.alibaba.commons.mapper.UserMapper;
import com.gk.cloud.alibaba.commons.model.User;
import com.gk.cloud.alibaba.provider.api.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/11/28
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
       return userMapper.insertSelective(user);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }
}
