package com.luopm.photome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luopm.photome.dao")
public class PhotomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotomeApplication.class, args);
    }
}
