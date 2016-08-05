package com.dzz.controller;

import com.dzz.config.BznConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by dzz on 16/8/4.
 */
@RequestMapping("/api")
@RestController
public class JSController {

    @Autowired
    private BznConfig bznConfig;

    @RequestMapping(value="",method = RequestMethod.GET)
    public String getJS(String ak,String v) throws IOException{

        return bznConfig.resourceToString();
    }

}
