package com.afacez.sericefeign.Service.impl;

import com.afacez.sericefeign.Service.FeginService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author hongfu
 * @Date 2019/10/25/0025 9:20
 */
@Component
public class FeginServiceHystric implements FeginService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
