package com.powernode.springboot306propertieslocation.congif;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${myapp.path}")
    private String appPath;

    public void printInfo(){
        System.out.println(appPath);
    }
}
