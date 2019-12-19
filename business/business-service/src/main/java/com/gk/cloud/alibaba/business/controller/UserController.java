package com.gk.cloud.alibaba.business.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.gk.cloud.alibaba.business.controller.block.UserBlockHandler;
import com.gk.cloud.alibaba.business.feign.UserServiceFeign;
import com.gk.cloud.alibaba.commons.model.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/5
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserServiceFeign userServiceFeign;

    @GetMapping(value = "/list")
    /**
     * 需要在 sentinel-dashboard 中对 block 进行限流才能触发 getUsersBlock 方法的执行
     */
    @SentinelResource(value = "block", blockHandler = "getUsersBlock", blockHandlerClass = {UserBlockHandler.class})
    public List<User> getAllUsers(@RequestParam String param) {
        List<User> allUsers = userServiceFeign.getAllUsers(param);
        System.out.println(allUsers.size());
        return allUsers;
    }

}
