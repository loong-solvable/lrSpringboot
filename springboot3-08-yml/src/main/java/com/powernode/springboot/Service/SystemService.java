package com.powernode.springboot.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SystemService {
    @Value("${myapp.name}")
    private String name;
    @Value("${myapp.email}")
    private String email;
    @Value("${myapp.age}")
    private Integer age;

    public void print(){
        System.out.println( name + email + age );
    }
}
