package com.dw.member.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//WebConfig : 웹 설정
//Config : 설정
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    Interceptor interceptor; // 우리가 만든 인터셉터 불러옴

    // addInterceptors : 인터셉터를 추가하는 함수 재정의
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] patterns = { "/login", "/join", "/error", "/resources/static/*", "/api/v1/login" };// 인터셉터 제외 URL
        registry.addInterceptor(interceptor).excludePathPatterns(patterns);
    }

}
