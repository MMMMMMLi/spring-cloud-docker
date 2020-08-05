package com.mengli.consumer.controller;

import com.mengli.consumer.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/consumer")
public class HelloController {

    @Autowired
    private ProducerRemote producerRemote;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return producerRemote.index(name);
    }

    @RequestMapping("/dateTime")
    public String dateTime() {
        return LocalDateTime.now().toString();
    }

    @RequestMapping("/dbTest")
    public String dbTest(HttpServletRequest request) {
        return producerRemote.dbTest(request);
    }

}
