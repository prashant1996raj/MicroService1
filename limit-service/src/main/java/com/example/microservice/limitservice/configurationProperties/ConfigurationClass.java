package com.example.microservice.limitservice.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="limit-service")
public class ConfigurationClass {

    private String minimum ;
    private String maximum;


    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public ConfigurationClass(String minimum, String maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
