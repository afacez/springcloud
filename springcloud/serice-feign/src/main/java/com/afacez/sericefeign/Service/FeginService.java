package com.afacez.sericefeign.Service;

import com.afacez.sericefeign.Service.impl.FeginServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @Author hongfu
 * @Date 2019/10/24/0024 17:33
 */
@FeignClient(value = "service-hi",fallback = FeginServiceHystric.class)
public interface FeginService {

    @RequestMapping(value = "/eureka/{name}",method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable(value = "name") String name);

}
