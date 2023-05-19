package com.develhope.middleware2.config;

import com.develhope.middleware2.interceptor.MonthsInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private MonthsInterceptor monthsInterceptor;

    @Override
    public void addInterceptors(final InterceptorRegistry registry){
        registry.addInterceptor(monthsInterceptor).addPathPatterns("/months");
    }

}
