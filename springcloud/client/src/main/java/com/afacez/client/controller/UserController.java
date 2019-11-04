package com.afacez.client.controller;

import com.afacez.client.feignClient.UserFeignClient;
import com.afacez.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hongfu
 * @Date 2019/9/24/0024 14:17
 */

@RestController
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        User user = this.userFeignClient.findById(id);
        return user;
    }
}
