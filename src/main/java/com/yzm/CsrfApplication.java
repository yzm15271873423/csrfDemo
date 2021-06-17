package com.yzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yzm
 * @Date: 2021/6/17 - 06 - 17 - 21:58
 */

@SpringBootApplication
public class CsrfApplication {

    //这是main方法，是程序的入口
    public static void main(String[] args) {
        SpringApplication.run(CsrfApplication.class,args);
    }
}
