package com.hitsme.springboot.demo.demo.dao;

import com.hitsme.springboot.demo.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户信息表
 *
 * @author mgl
 * @date 2018-09-28 01:44:35
 */
public interface UserMapper {

    User selectOne(@Param("id") Long userid);

    List<User> selectList();


}



