package com.nik.springresourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/hello")
    public String getMessage () {
        return "hello from controller";
    }
//http://127.0.0.1:8765/RESOURCE-SERVER/hello


}
