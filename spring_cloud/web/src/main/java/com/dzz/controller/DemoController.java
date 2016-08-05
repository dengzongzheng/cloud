package com.dzz.controller;

import com.dzz.config.MongoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dzz on 16/8/4.
 */
@Controller
public class DemoController {

    @Autowired
    private MongoConfig mongoConfig;

    @GetMapping("demo")
    public String demo(){

        System.out.println(mongoConfig.toString());
        return "demo";
    }
}
