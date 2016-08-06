package com.dzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by dzz on 16/8/6.
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){

        return "index";
    }
}
