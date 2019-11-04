package com.afacez.ribbonservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hongfu
 * @Date 2019/10/24/0024 17:04
 */
@RestController
public class RibbonServiceController {

    @Value("${server.port}")
    Long port;

    @GetMapping("/eureka/{id}")
    public String findById(@PathVariable String id) {

        return "hi !"+ id + ",your port is "+port;
    }

}
