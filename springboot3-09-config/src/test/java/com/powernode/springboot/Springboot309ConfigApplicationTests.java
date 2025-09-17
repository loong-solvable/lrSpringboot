package com.powernode.springboot;

import com.powernode.springboot.config.ProFilesActiveConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot309ConfigApplicationTests {


    @Autowired
    private ProFilesActiveConfig profilesactiveconfig;
    @Test
    void test() {
        profilesactiveconfig.print();
    }

}
