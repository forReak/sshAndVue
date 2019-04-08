package com.furao.sshVue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/index1")
    public String hello(){
        return "firstDemo";
    }

    @RequestMapping("/firstDemo")
    public String hello2(){
        return "hello";
    }
}
