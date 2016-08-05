package com.dzz.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dzz on 16/7/17.
 */

@RestController
@RequestMapping(value = "/some")
public class SomeResource {

    @RequestMapping(value = "/getMessage",method = RequestMethod.GET)
    public String getMessage(){

        return "some message";
    }
}
