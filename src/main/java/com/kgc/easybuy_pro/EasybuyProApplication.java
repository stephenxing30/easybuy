package com.kgc.easybuy_pro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.kgc.easybuy_pro.mapper")
@SpringBootApplication
public class EasybuyProApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasybuyProApplication.class, args);
    }
}
