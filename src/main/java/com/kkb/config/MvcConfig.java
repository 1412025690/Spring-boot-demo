package com.kkb.config;

import com.kkb.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 声明这是一个配置类
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Bean //在spring中注册一个拦截器
    public LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Override// 注册拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginInterceptor()).addPathPatterns("/**");
    }
}
