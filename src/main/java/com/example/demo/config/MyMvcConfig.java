package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@Component
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //添加视图映射
        registry.addViewController("/main").setViewName("blank_page");

    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry){
                registry.addViewController("/user_manage").setViewName("test");
                registry.addViewController("/index").setViewName("blank_page");
                registry.addViewController("/index.html").setViewName("blank_page");
//                registry.addViewController("/publish").setViewName("publish");
            }
        };
        return webMvcConfigurer;
    }
}
