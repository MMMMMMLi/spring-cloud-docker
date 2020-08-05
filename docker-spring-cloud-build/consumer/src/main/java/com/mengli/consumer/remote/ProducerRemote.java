package com.mengli.consumer.remote;

import com.mengli.consumer.hystrix.ProducerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@FeignClient(name = "producer",fallback = ProducerHystrix.class)
public interface ProducerRemote {

    @RequestMapping(value = "/producer/hello")
    public String index(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/producer/dbTest")
    public String dbTest(HttpServletRequest request);
}
