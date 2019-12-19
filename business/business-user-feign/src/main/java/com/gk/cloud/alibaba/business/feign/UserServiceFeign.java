package com.gk.cloud.alibaba.business.feign;

import com.gk.cloud.alibaba.commons.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/5
 */
@FeignClient(value = "user-service", path = "userService")
public interface UserServiceFeign {

    @GetMapping(value = "/list")
    public List<User> getAllUsers(@RequestParam String param);

    @PostMapping(value = "/add")
    public String addUser(@RequestBody User user);


}
