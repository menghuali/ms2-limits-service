package com.aloha.microservices.limitsservice;

import com.aloha.microservices.limitsservice.bean.Limits;
import com.aloha.microservices.limitsservice.config.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration conf;
    

    @GetMapping("/limits")
    public Limits getLimits() {
        return new Limits(conf.getMinimum(), conf.getMaximum());
    }

}
