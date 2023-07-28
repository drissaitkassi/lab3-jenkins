package com.example.jenlab;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {


    @GetMapping("/lab")
    public String getLabInfo(){
        return "this lab is made by EMIL ASTIH";
    }
}
