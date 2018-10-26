package com.hitsme.springboot.demo.demo.interceptor;

import com.hitsme.springboot.demo.demo.entity.User;
import com.hitsme.springboot.demo.demo.redis.RedisCatch;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户行为和用户权限-拦截器
 *
 * @author mgl
 */
public class UserInterceptor extends HandlerInterceptorAdapter {

    private RedisCatch redisCatch;

    UserInterceptor(RedisCatch redisCatch) {
        this.redisCatch = redisCatch;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*获取cookie*/
        Object token = redisCatch.get("hello");
        if (token == null) {
            response.sendRedirect("/test");
        } else {

                return true;
        }
        return false;
    }
}
