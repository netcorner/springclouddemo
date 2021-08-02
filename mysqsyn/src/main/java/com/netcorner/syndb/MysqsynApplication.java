package com.netcorner.syndb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class MysqsynApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MysqsynApplication.class, args);
	}
	@Resource
	private CanalClient canalClient;

	@Override
	public void run(String... strings) throws Exception {
		//项目启动，执行canal客户端监听
		canalClient.run();
	}
}
