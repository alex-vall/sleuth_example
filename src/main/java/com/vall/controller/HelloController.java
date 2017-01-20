package com.vall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alex.volosatov
 * Creation date 20.01.2017.
 */

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {

        log.info("Hello called!");

        return "hello";
    }

}
