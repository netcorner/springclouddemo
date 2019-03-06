package com.netcorner;

import com.netcorner.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy //开启网关代理
@EnableEurekaClient //注册eureka服务
@SpringBootApplication //springboot开启
public class ApigetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigetwayApplication.class, args);
	}

	/**
	 * 通过@Component注解到具体类也可以实现以下方式
	 * @return
	 */
	@Bean
	public TokenFilter loginFilter() {
		return new TokenFilter();
	}
}
