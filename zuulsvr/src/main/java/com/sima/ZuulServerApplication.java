package com.sima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by qisima on 1/9/2019 12:58 PM
 */
@SpringBootApplication
@EnableZuulProxy
@ComponentScan
public class ZuulServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
