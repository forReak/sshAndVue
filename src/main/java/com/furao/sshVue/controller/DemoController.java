package com.furao.sshVue.controller;

import com.furao.sshVue.entity.RespMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello2(){
        return "hello";
    }

    @RequestMapping("/testRest")
    @ResponseBody
    public RespMap testRest (){
        RespMap resp = new RespMap(true,new String("i am a message"),"success");
        return resp;
    }
}
