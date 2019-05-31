package com.example.demo.service;

import com.example.demo.dao.VisitorCountDAO;
import com.example.demo.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    @Autowired
    private VisitorCountDAO visitorCountDAO;

//    @Autowired
//    private VisitorDAO visitorDAO;

    public Visitor addVisitor(Visitor visitor) {
//        Visitor result = visitorDAO.save(visitor);

//        if (result != null) {
//            String numberOfVisitors = visitorCountDAO.getVisitCount();
//            int currentValue = Integer.parseInt(numberOfVisitors);
//            int updatedValue = ++currentValue;
//            String newValue = String.valueOf(updatedValue);
//            visitorCountDAO.setVisitCount(newValue);
//        }

//        return result;
        return null;
    }

    public String getNumberOfVisitors() {
        return visitorCountDAO.getVisitCount();
    }

    public List<Visitor> getVisitors() {
//        return (List<Visitor>) visitorDAO.findAll();
        return null;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
