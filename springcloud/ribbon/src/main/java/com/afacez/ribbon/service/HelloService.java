package com.afacez.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author hongfu
 * @Date 2019/10/18/0018 17:03
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

//    public String hiService(String name) {
//        return restTemplate.getForObject("http://service-hi/eureka/"+name,String.class);
//    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/eureka/"+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}


