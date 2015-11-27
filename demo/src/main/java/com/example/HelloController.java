package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author LinQ
 * @version 2015-11-26
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${cf.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "hello " + name;
    }
}
