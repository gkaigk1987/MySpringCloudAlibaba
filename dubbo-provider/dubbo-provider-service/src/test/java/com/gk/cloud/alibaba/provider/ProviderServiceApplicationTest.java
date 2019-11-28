package com.gk.cloud.alibaba.provider;

import com.gk.cloud.alibaba.commons.mapper.UserMapper;
import com.gk.cloud.alibaba.commons.model.User;
import com.gk.cloud.alibaba.provider.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/11/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class ProviderServiceApplicationTest {

    @Autowired
    private UserMapper userMapper;

//    @Autowired    //测试通过
//    @Resource     //测试通过
    @Reference(version = "1.0.0")   //测试通过
    private UserService userService;

    @Test
    public void test001() {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id",1L);
        List<User> users = userMapper.selectByExample(example);
        System.out.println(users.get(0).getUsername());
    }

    @Test
    public void test002() {
        List<User> userList = userService.getUserList();
        System.out.println(userList.get(0).getUsername());
    }



}
