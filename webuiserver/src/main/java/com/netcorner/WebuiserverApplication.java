package com.netcorner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 //开启swagger2 访问：http://IP:port/{context-path}/swagger-ui.html
@EnableDiscoveryClient //发现eureka服务
@EnableEurekaClient //注册eureka服务
@SpringBootApplication //springboot开启
public class WebuiserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebuiserverApplication.class, args);
	}

}
