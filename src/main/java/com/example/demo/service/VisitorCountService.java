package com.example.demo.service;

import com.example.demo.dao.VisitorCountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorCountService {

    @Autowired
    private VisitorCountDAO visitorCountDAO;

    public String getVisitCount() {
        String numberOfVisitors = visitorCountDAO.getVisitCount();
        int currentValue = Integer.parseInt(numberOfVisitors);
        int updatedValue = ++currentValue;
        String newValue = String.valueOf(updatedValue);
        visitorCountDAO.setVisitCount(newValue);

        return "You are the " + updatedValue + " visitor of our service";
    }
}
