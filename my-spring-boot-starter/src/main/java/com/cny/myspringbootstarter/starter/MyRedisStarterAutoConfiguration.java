package com.cny.myspringbootstarter.starter;

import com.cny.myspringbootstarter.service.MyService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : chennengyuan
 */
@Configuration
@ConditionalOnClass(MyRedisStarter.class)
@EnableConfigurationProperties(MyRedisStarterProperties.class)
public class MyRedisStarterAutoConfiguration {

    @Bean
    public MyService getMyService() {
        return new MyService();
    }
}
