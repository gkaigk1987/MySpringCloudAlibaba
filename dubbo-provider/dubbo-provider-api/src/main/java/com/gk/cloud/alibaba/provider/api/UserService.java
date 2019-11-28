package com.gk.cloud.alibaba.provider.api;

import com.gk.cloud.alibaba.commons.model.User;

import java.util.List;

/**
 *
 */
public interface UserService {

    public int addUser(User user);

    public List<User> getUserList();

}
