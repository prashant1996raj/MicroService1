package com.example.microservice.limitservice.controller;


import com.example.microservice.limitservice.configurationProperties.ConfigurationClass;
import com.example.microservice.limitservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    ConfigurationClass config ;


    @GetMapping("/limit")
    public Limits getLimit(){

        return new  Limits(Integer.parseInt(config.getMinimum()),Integer.parseInt(config.getMaximum()));
      //  return  new Limits(1,1000);
    }
}
