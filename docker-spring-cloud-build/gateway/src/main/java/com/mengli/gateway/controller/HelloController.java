package com.mengli.gateway.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/pazi")
    public String index() {
        return "soory，server is done !!!!!!!!!!!!";
    }

}