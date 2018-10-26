package com.hitsme.springboot.demo.demo.interceptor;

import com.hitsme.springboot.demo.demo.redis.RedisCatch;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * 拦截器配置文件
 *
 * @author mgl
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Resource
    private RedisCatch redisCatch;

    public void addInterceptors(InterceptorRegistry registry) {

        // 用户会话拦截器
        registry.addInterceptor(new UserInterceptor(redisCatch))
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/login/*", "/register", "/register/*", "/test", "/static/**");
    }

}
