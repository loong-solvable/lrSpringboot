package com.powernode.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component//纳入ioc管理
@ConfigurationProperties(prefix = "myapp")
public class AppConfig {
    //属性名要一样
    private String username;
    private String password;
    private Integer age;
    private Boolean gender;
    //setterfangfa

    @Override
    public String toString() {
        return "AppConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
