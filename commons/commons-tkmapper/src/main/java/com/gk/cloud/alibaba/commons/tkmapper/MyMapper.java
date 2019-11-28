package com.gk.cloud.alibaba.commons.tkmapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: TODO
 * @Author: GK
 * @Date: 2019/11/28
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
