package com.netcorner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableCircuitBreaker //开启服务保护
@EnableFeignClients //开启feign客户端
@EnableDiscoveryClient //发现eureka服务
@EnableEurekaClient //注册eureka服务
@SpringBootApplication //springboot开启
public class OrderapiserviceimplApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderapiserviceimplApplication.class, args);
	}

	/**
	 * 装载RestTemplate 可使用Autowired调用到
	 * @return
	 */
	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
