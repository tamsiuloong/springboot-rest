package com.coachtam.sj.config.cors;

//import com.coachtam.sj.config.MyCorsRegistration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coach tam
 * @date 2018/1/11
 */
@Configuration
@ConfigurationProperties(prefix="cors")
public class CorsConfig {
    private String allowedHeaders;
    private List<String> allowedOrigins;
    private Boolean allowCredentials;
    private Long maxAge;
    private String[] allowedMethods;
    private String[] exposedHeaders;



    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        // 对响应头进行CORS授权
        MyCorsRegistration corsRegistration = new MyCorsRegistration("*");
        // 允许的请求来源
        String[] objects = allowedOrigins.toArray(new String[allowedOrigins.size()]);

        corsRegistration
                //允许向该服务器提交请求的URI，*表示全部允许
                .allowedOrigins(objects)
                //允许提交请求的方法，*表示全部允许
                .allowedMethods(allowedMethods)
                //允许的头信息,*标识全部允许
                .allowedHeaders(allowedHeaders)
                //暴露的头信息
                .exposedHeaders(exposedHeaders)
                //允许Cookie跨域，在做登录校验的时候有用
                .allowCredentials(allowCredentials)
                //预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
                .maxAge(maxAge);

        // 注册CORS过滤器
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        //第一个参数表示过滤的url,*表示过滤所有
        configurationSource.registerCorsConfiguration("/**", corsRegistration.getCorsConfiguration());
        CorsFilter corsFilter = new CorsFilter(configurationSource);

        return new FilterRegistrationBean(corsFilter);
    }

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        // 对响应头进行CORS授权
//        MyCorsRegistration corsRegistration = new MyCorsRegistration("*");
//        List<String> allowedOrigins = new ArrayList<>();
//        // 允许的请求来源
//        allowedOrigins.add("http://localhost:8082");
//        String[] objects = allowedOrigins.toArray(new String[allowedOrigins.size()]);
//
//        corsRegistration
//                //允许向该服务器提交请求的URI，*表示全部允许
//                .allowedOrigins(objects)
//                //允许提交请求的方法，*表示全部允许
//                .allowedMethods(HttpMethod.DELETE.name(), HttpMethod.GET.name(), HttpMethod.HEAD.name(), HttpMethod.POST.name(), HttpMethod.PUT.name())
//                //允许的头信息,*标识全部允许
//                .allowedHeaders(CrossOrigin.DEFAULT_ALLOWED_HEADERS)
//                //暴露的头信息
//                .exposedHeaders(HttpHeaders.SET_COOKIE)
//                //允许Cookie跨域，在做登录校验的时候有用
//                .allowCredentials(CrossOrigin.DEFAULT_ALLOW_CREDENTIALS)
//                //预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
//                .maxAge(CrossOrigin.DEFAULT_MAX_AGE);
//
//        // 注册CORS过滤器
//        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
//        //第一个参数表示过滤的url,*表示过滤所有
//        configurationSource.registerCorsConfiguration("/**", corsRegistration.getCorsConfiguration());
//        CorsFilter corsFilter = new CorsFilter(configurationSource);
//
//        return new FilterRegistrationBean(corsFilter);
//    }

    public String getAllowedHeaders() {
        return allowedHeaders;
    }

    public List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public Boolean getAllowCredentials() {
        return allowCredentials;
    }

    public Long getMaxAge() {
        return maxAge;
    }

    public String[] getAllowedMethods() {
        return allowedMethods;
    }

    public String[] getExposedHeaders() {
        return exposedHeaders;
    }

    public void setAllowedHeaders(String allowedHeaders) {
        this.allowedHeaders = allowedHeaders;
    }

    public void setAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    public void setAllowedMethods(String[] allowedMethods) {
        this.allowedMethods = allowedMethods;
    }

    public void setExposedHeaders(String[] exposedHeaders) {
        this.exposedHeaders = exposedHeaders;
    }
}
