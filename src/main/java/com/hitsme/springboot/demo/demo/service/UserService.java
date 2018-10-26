package com.hitsme.springboot.demo.demo.service;

import com.hitsme.springboot.demo.demo.dao.UserMapper;
import com.hitsme.springboot.demo.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息
 *
 * @author mgl
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User selectByUserId(Long userid) {
        return userMapper.selectOne(userid);
    }


    public List<User> selectList() {
        return userMapper.selectList();
    }

}
