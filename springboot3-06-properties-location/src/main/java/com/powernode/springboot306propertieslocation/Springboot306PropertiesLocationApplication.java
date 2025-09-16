package com.powernode.springboot306propertieslocation;

import com.powernode.springboot306propertieslocation.congif.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot306PropertiesLocationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot306PropertiesLocationApplication.class, args);
        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
        appConfig.printInfo();
        applicationContext.close();
    }

}
