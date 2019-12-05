package com.gk.cloud.alibaba.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/12/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BusinessUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessUserServiceApplication.class,args);
    }

}
