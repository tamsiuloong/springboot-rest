package com.coachtam.sj.config.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2018/1/29.
 */
//@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");

//        registry.addMapping("/api/**")
//                .allowedOrigins("http://192.168.1.97")
//                .allowedMethods("GET", "POST")
//                .allowCredentials(false).maxAge(3600);
    }
}
