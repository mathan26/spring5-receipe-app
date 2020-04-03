package com.github.mathan26.spring5receipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("Index");
        System.out.println("Index");
        return "index";
    }
}
