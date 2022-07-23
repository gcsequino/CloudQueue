package com.server.server;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ServerController {
    @GetMapping("/")
    String hello() {
        return "Hello world";
    }
}
