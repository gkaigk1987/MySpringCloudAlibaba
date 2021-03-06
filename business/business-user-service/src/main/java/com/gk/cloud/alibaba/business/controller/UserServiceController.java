package com.gk.cloud.alibaba.business.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.gk.cloud.alibaba.business.controller.fallback.UserServiceFallback;
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
    /**
     * 熔断定义
     * 当下游服务下线或异常无法访问才能触发 getUsersFallback 方法的执行
     */
    @SentinelResource(value = "fallback",fallback = "getUsersFallback",fallbackClass = {UserServiceFallback.class})
    public List<User> getAllUsers(@RequestParam String param) {
        System.out.println("=================" + param + "===============");
        return userService.getUserList();
    }

    @PostMapping(value = "/add")
    public String addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return "成功";
        }catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }

}
