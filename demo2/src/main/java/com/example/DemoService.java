package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * DemoService
 *
 * @author LinQ
 * @version 2015-11-26
 */
@Service
public class DemoService {
    @Autowired
    private SampleClient client;

    public String reqHello() {
        String hello = client.hello();
        System.out.println(hello);
        return hello;
    }

    @FeignClient("hello-service")
    public interface SampleClient {

        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        String hello();
    }
}
