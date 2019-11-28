package com.gk.cloud.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/11/28
 */
@MapperScan(basePackages = {"com.gk.cloud.alibaba.commons.mapper"}) //使用tk.mybatis的MapperScan
@SpringBootApplication
public class ProviderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class,args);
    }
}
