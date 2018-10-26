package com.hitsme.springboot.demo.demo.controller;


import com.hitsme.springboot.demo.demo.dao.UserMapper;
import com.hitsme.springboot.demo.demo.entity.User;
import com.hitsme.springboot.demo.demo.redis.RedisCatch;
import com.hitsme.springboot.demo.demo.service.UserService;
import com.hitsme.springboot.demo.demo.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * 首页
 *
 * @author mgl
 */
@Controller
public class UserController {
    @Resource
    UserService userService;
@Resource
    RedisCatch redisCatch;
    /**
     * 测试功能页
     *
     * @return 页面
     */
    @RequestMapping(value = "/reset", method = RequestMethod.GET)

@ResponseBody
    public User reset() {
        User user=userService.selectList().get(0);
        redisCatch.set("hello","world");
        System.out.println(redisCatch.get("hello"));
        return user;
    }

    /**
     * 测试功能页
     *
     * @return 页面
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {

        return "index";
    }

}
