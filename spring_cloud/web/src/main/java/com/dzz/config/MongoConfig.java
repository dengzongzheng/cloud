package com.dzz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * Created by dzz on 16/8/4.
 */
@Service
@PropertySource(value = "classpath:/test.properties",encoding = "utf-8")
public class MongoConfig {

    @Value("${dzz.name}")
    private String name;

    @Value("${dzz.sex}")
    private String sex;

    @Value("${dzz.env}")
    private String env;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "MongoConfig{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", env='" + env + '\'' +
                '}';
    }
}
