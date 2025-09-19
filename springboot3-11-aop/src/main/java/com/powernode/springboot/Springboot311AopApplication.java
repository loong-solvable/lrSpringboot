package com.powernode.springboot;

import com.powernode.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot311AopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot311AopApplication.class, args);
		UserService userService = applicationContext.getBean(UserService.class);

		userService.save(111L,"jack");
		userService.deleteById(111L);

		applicationContext.close();
	}

}
