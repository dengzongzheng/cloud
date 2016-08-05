package com.dzz.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by dzz on 16/8/4.
 */
@Configuration
public class BznConfig {


    @Value("classpath:bzn.js")
    private Resource bznApi;

    private  String js;

    public String resourceToString() throws IOException{

        if(null!=js&&!"".equals(js)){
            return js;
        }else{
            return IOUtils.toString(bznApi.getInputStream());
        }
    }

}
