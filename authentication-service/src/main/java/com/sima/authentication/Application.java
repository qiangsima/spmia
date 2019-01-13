package com.sima.authentication;

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
    public Map<String, Object> user(OAuth2Aunthentication user){
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put(
                "user",
                user.getUserAuthentication().getPrincipal()
        );
        userInfo.put(
                "authorities",
                user.getAuthentication().getAuthorities()
        );

        return userInfo;
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
