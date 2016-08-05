package com.dzz.service;

import com.dzz.service.feignclient.HouseFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dzz on 16/7/17.
 */
@Service
public class HouseService {

    @Autowired
    private HouseFeignClient houseFeignClient;

    public String sayHolle(String name){
        return houseFeignClient.sayHello(name);
    }

    public String fallbackSayHello(){
        return "error";
    }

}
