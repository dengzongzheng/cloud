package com.news.passport.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author：dzz
 * @since： 2016年09月15 下午3:00
 * @version:
 */
@Controller
public class LoginController {

    private Logger logger = LogManager.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login() {

        return "login";
    }
}
