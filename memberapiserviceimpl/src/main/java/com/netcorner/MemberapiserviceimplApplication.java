package com.netcorner;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2 //开启swagger2 访问：http://IP:port/{context-path}/swagger-ui.html
@EnableCircuitBreaker //开启服务保护
@EnableFeignClients //开启feign客户端
@EnableDiscoveryClient //发现eureka服务
@EnableEurekaClient //注册eureka服务
@SpringBootApplication //springboot开启
@EnableDistributedTransaction //开启分布式做事务
public class MemberapiserviceimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberapiserviceimplApplication.class, args);
	}



}
