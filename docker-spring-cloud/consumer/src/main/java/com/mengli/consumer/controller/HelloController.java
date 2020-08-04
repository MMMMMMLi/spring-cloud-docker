package com.mengli.consumer.controller;

import com.mengli.consumer.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class HelloController {

    @Autowired
    private ProducerRemote producerRemote;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return producerRemote.index(name);
    }

}
