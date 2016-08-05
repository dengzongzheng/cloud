package com.dzz.service.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dzz on 16/7/17.
 */
@FeignClient("house")
public interface HouseFeignClient {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody String sayHello(String name);
}
