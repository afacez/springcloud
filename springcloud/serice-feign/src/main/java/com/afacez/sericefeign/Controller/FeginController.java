package com.afacez.sericefeign.Controller;

import com.afacez.sericefeign.Service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author hongfu
 * @Date 2019/10/24/0024 17:34
 */
@RestController
public class FeginController {

    @Autowired
    FeginService feginService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feginService.sayHiFromClientOne(name);
    }
}
