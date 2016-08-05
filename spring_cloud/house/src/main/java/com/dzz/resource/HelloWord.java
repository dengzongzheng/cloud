package com.dzz.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dzz on 16/7/17.
 */
@RestController
public class HelloWord {

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String sayHello(String name){

        return name+" say hello!";
    }

}
