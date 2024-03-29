package com.stackroute.Muzix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MuzixApplication {

	public static void main(String[] args)throws InterruptedException {
		SpringApplication.run(MuzixApplication.class, args);
	}

}
