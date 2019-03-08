package com.netcorner;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableTransactionManagerServer //开启lcn服务
@EnableDiscoveryClient //发现eureka服务
@EnableEurekaClient //注册eureka服务
@SpringBootApplication
public class TxlcnserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxlcnserverApplication.class, args);
	}

}
