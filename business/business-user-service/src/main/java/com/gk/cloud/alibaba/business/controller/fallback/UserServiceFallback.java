package com.gk.cloud.alibaba.business.controller.fallback;

import com.gk.cloud.alibaba.commons.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/10
 */
//@Slf4j
public class UserServiceFallback {

    private static  final Logger log = LoggerFactory.getLogger(UserServiceFallback.class);

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
