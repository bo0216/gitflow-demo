package com.example.subcsubscribe.controller;

import com.example.subcsubscribe.service.SubsMstSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/subscription")
public class SubsMstCtl {

    @Autowired
    public static SubsMstSvc mstSvc;

    @GetMapping("/subscriptions")
    public List<String> getSubsList() {
        return mstSvc.getSubsList();
    }

}
