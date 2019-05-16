package com.example.demo.controller;

import com.example.demo.service.VisitorCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private VisitorCountService visitorCountService;

    @RequestMapping(value = "/visitor")
    @ResponseBody
    public String getHello() {
        String visitCount = visitorCountService.getVisitCount();

        return visitCount;
    }
}