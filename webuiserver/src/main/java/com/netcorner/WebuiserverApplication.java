package com.netcorner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //注册eureka服务
@SpringBootApplication //springboot开启
public class WebuiserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebuiserverApplication.class, args);
	}

}
