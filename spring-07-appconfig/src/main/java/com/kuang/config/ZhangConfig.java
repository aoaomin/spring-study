package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LX
 */
@Configuration
@ComponentScan("com.kuang.pojo")
@Import(ZhangConfig2.class)
public class ZhangConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
