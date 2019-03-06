package com.netcorner.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by shijiufeng on 2019/2/28.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}