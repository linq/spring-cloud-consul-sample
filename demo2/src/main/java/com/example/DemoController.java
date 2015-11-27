package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 *
 * @author LinQ
 * @version 2015-11-27
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService service;

    @RequestMapping("/demo")
    public String demo() {
        return service.reqHello();
    }
}
