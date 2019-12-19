package com.gk.cloud.alibaba.business.controller;

import com.gk.cloud.alibaba.business.feign.UserServiceFeign;
import com.gk.cloud.alibaba.commons.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/19
 */
@RefreshScope   //动态刷新nacos中的配置
@RestController
@RequestMapping(value = "/service")
public class UserServiceController {

    @Resource
    private UserServiceFeign userServiceFeign;

    /**
     * 获取 nacos 配置中 key 为 username 的属性的值
     */
    @Value("${username}")
    private String username;

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user) {
        return userServiceFeign.addUser(user);
    }

    @GetMapping(value = "/username")
    public String getProperty() {
        return username;
    }
}
