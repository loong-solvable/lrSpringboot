package com.powernode.springboot.config;

import org.springframework.beans.factory.annotation.Value;

public class ProFilesActiveConfig {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    public void print(){
        System.out.println(username + "," + password + "," + url);
    }
}
