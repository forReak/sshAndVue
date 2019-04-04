package com.furao.sshVue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/index")
    public String gotoIndex(){
        return "index";
    }
}
