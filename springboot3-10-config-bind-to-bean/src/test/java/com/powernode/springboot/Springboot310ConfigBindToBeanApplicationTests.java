package com.powernode.springboot;

import com.powernode.springboot.bean.Address;
import com.powernode.springboot.bean.AppBean;
import com.powernode.springboot.bean.Group;
import com.powernode.springboot.bean.User;
import com.powernode.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot310ConfigBindToBeanApplicationTests {
    @Autowired
    private AppConfig appConfig;

    @Test
    void test01() {
        System.out.println(appConfig);
    }


    @Autowired
    private User user;
    @Test
    void test02(){
        System.out.println(user);
    }

    @Autowired
    private AppBean appBean;

    @Test
    void test03(){
        System.out.println(appBean);
    }

    @Autowired
    private Address address;

    @Test
    void test04(){
        System.out.println(address);
    }

    @Autowired
    private Group group;

    @Test
    void test05(){
        System.out.println(group);
    }
}
