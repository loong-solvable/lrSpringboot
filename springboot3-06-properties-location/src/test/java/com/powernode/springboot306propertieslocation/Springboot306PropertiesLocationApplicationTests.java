package com.powernode.springboot306propertieslocation;

import com.powernode.springboot306propertieslocation.congif.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot306PropertiesLocationApplicationTests {

    @Autowired
    private AppConfig appConfig;

    @Test
    void test01() {
        appConfig.printInfo();
    }

}
