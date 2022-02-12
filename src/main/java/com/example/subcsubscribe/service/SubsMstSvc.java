package com.example.subcsubscribe.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubsMstSvc {

    public List<String> getSubsList() {
        List<String> rsltList = new ArrayList<>();

        rsltList.add("SC000001");
        rsltList.add("SC000002");
        rsltList.add("SC000003");
        return rsltList;
    }
}
