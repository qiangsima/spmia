package com.sima.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qisima on 1/13/2019 4:03 PM
 */
@SpringBootApplication
@RestController
@EnableResourceServer
@EnableAuthorizationServer
public class Application {

    @RequestMapping(value = {"/user"}, produces = "application/json")
    public Map<String, Object> user(OAuth2Authentication user){
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put(
                "user",
                user.getUserAuthentication().getPrincipal()
        );
        userInfo.put(
                "authorities",
                user.getUserAuthentication().getAuthorities()
        );

        return userInfo;
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
