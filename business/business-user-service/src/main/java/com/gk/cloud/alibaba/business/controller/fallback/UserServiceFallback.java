package com.gk.cloud.alibaba.business.controller.fallback;

import com.gk.cloud.alibaba.commons.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/10
 */
@Slf4j
public class UserServiceFallback {

    /**
     * 熔断方法
     * @param param
     * @param ex
     * @return
     */
    public static List<User> getUsersFallback(String param,Throwable ex) {
        log.warn("调用熔断:{}",ex.getMessage());
        return null;
    }

}
