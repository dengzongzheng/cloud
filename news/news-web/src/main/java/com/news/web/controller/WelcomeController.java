package com.news.web.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author：dzz
 * @since： 2016年09月15 下午12:52
 * @version:
 */
@Controller
public class WelcomeController {

    private Logger logger = LogManager.getLogger(WelcomeController.class);


	@GetMapping("/")
	public String welcome() {
		return "index";
	}

}
