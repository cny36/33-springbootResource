package com.cny.myspringbootstarter.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : chennengyuan
 */
@Data
@ConfigurationProperties(prefix = "myredisstarter")
public class MyRedisStarterProperties {

    private String username;

    private String ip;

    private int port = 8964;
}
