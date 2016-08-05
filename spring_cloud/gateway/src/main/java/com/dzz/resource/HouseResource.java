package com.dzz.resource;

import com.dzz.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dzz on 16/7/17.
 */
@RestController
public class HouseResource {

    @Autowired
    private HouseService houseService;

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(String name){
        return houseService.sayHolle(name);
    }

}
