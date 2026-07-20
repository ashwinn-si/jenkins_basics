package com.ashwinsi.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/api/health")
    public String health(){
        return "aliveeeeeeeeeeeeeeee";
    }
}
