package com.powernode.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "xyz")
public class User {
    private String name;
    private Address addr;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
}
