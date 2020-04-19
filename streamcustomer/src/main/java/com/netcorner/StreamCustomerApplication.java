package com.netcorner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(ReadMessageInterface.class)
public class StreamCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamCustomerApplication.class, args);
	}

}
