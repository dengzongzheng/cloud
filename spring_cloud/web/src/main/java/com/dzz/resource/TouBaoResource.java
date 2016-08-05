package com.dzz.resource;

import com.dzz.config.BznConfig;
import com.dzz.domain.Base;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dzz on 16/8/4.
 */
@RestController
@RequestMapping("/toubao")
public class TouBaoResource  {


    @PostMapping("/eak")
    public String eak(Base base,HttpServletResponse response){

        response.setHeader("Access-Control-Allow-Origin","*");
        System.out.println(base.getName()+"___"+base.getSex());
        return "ok";
    }

}
