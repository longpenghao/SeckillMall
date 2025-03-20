package com.test.seckillv1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.test.seckillv1.mapper")
public class SeckillV1Application {

    public static void main(String[] args) {
        SpringApplication.run(SeckillV1Application.class, args);
    }

}
