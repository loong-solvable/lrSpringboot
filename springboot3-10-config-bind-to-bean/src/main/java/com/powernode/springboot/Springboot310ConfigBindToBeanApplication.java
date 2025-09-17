package com.powernode.springboot;

import com.powernode.springboot.bean.AppBean;
import com.powernode.springboot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//将配置信息绑定到Bean

@EnableConfigurationProperties({User.class, AppBean.class} )
//@ConfigurationPropertiesScan(basePackages = "com.powernode.springboot.bean")
@SpringBootApplication
public class Springboot310ConfigBindToBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot310ConfigBindToBeanApplication.class, args);
    }

}
