package com.sima.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by qisima on 12/27/2018 3:28 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
