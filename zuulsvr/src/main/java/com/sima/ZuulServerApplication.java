package com.sima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by qisima on 1/9/2019 12:58 PM
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApplication {

    public static void main(String[] args){
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
