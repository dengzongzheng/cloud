package com.dzz.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by dzz on 16/8/6.
 */
@Configuration
@ConfigurationProperties(prefix = "dzz",locations = "classpath:dzz.properties")
public class ElConfig {

    @Value("haha")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("${book.name}")
    private String name;

    @Value("classpath:test.js")
    private Resource test;

    @Value("${dzz.name}")
    private String name2;

    @Override
    public String toString() {
        return "ElConfig{" +
                "normal='" + normal + '\'' +
                ", osName='" + osName + '\'' +
                ", name='" + name + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }

    public String getTestJs() throws IOException{
        return IOUtils.toString(test.getInputStream());
    }
}
