package com.example.demo.controller;

import com.example.demo.model.Visitor;
import com.example.demo.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @PostMapping("/visit")
    public ResponseEntity visit(@RequestBody Visitor visitor) {
        Visitor result = visitorService.addVisitor(visitor);

        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/visitors/number")
    public ResponseEntity getNumberOfVisitors() {
        return ResponseEntity.ok().body("Number of visitors: " + visitorService.getNumberOfVisitors());
    }

    @GetMapping("/visitors")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok().body(visitorService.getVisitors());
    }

    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String getWelcome() {
        return "Welcome to AWS Samat!";
    }
}