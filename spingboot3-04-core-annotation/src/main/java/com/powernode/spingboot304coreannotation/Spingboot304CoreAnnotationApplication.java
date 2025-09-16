package com.powernode.spingboot304coreannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


/*
* 1.当前类被@SBA标注，是该项目的入口类
* 2.该类的main方法就是整个项目的入口
*
*3. @SpringBootApplication
* ::::::::
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
)
* @SpringBootApplication是一个复合注解，同时有以上三个注解的功能
*
* 4.@SpringBootConfiguration
    该注解标注的都是配置类
    * 从源码看，该注解被Congiguration标注。因此springboot项目的主入口类同时又是一个配置类
    * 因此在这里用@Bean标注方法，该方法的返回值对象会被纳入Ioc容器管理
**/
@SpringBootApplication
public class Spingboot304CoreAnnotationApplication {

    @Bean("date")
    public Date getDate(){
        return new Date();
    }

    public static void main(String[] args) {

        SpringApplication.run(Spingboot304CoreAnnotationApplication.class, args);
    }

}
