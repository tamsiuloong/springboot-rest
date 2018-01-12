package com.coachtam.sj.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages={"com.coachtam.sj"}) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.coachtam.sj.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("com.coachtam.sj.entity") // 扫描实体类
@SpringBootApplication
@EnableScheduling
public class Run extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
