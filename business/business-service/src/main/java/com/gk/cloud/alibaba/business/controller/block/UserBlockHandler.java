package com.gk.cloud.alibaba.business.controller.block;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.gk.cloud.alibaba.commons.model.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/16
 */
@Slf4j
public class UserBlockHandler {

    /**
     * 限流异常处理
     * @param param
     * @param ex
     * @return
     */
    public static List<User> getUsersBlock(String param, BlockException ex) {
        log.warn("限流异常：{}",ex.getRule());
        return new ArrayList<>();
    }

}
