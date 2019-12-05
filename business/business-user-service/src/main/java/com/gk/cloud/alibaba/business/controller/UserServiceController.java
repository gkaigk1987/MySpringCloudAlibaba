package com.gk.cloud.alibaba.business.controller;

import com.gk.cloud.alibaba.commons.model.User;
import com.gk.cloud.alibaba.provider.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/5
 */
@RestController
@RequestMapping(value = "userService")
public class UserServiceController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping(value = "/list")
    public List<User> getAllUsers(@RequestParam String param) {
        System.out.println("=================" + param + "===============");
        return userService.getUserList();
    }

}
