package com.example.cicd_3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("hi-cicd-docker")
    public String  hi(){

        return  "hi  cicd docker !!!  ^^^ !!!";
    }
}
