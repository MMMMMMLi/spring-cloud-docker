package com.mengli.consumer.hystrix;

import com.mengli.consumer.remote.ProducerRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ProducerHystrix implements ProducerRemote {

    @Override
    public String index(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
