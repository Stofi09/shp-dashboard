package com.devstofi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "/";
    }

    @RequestMapping("/user")
    public String userApi(){
        return "You must be a user";
    }


    @RequestMapping("/admin")
    public String adminApi(){
        return "You must be an admin";
    }
}
