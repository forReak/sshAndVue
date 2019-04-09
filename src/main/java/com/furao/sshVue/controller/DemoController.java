package com.furao.sshVue.controller;

import com.furao.sshVue.entity.RespMap;
import com.furao.sshVue.entity.ShelfEntity;
import com.furao.sshVue.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoController {
    @Autowired
    ShelfService shelfService;

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
    public RespMap testRest (Integer id){
        RespMap resp = new RespMap(true,new String("i am a message"),"success");
        ShelfEntity shelfById = shelfService.getShelfById(id);
        resp.setResult(shelfById);
        return resp;
    }

    @RequestMapping("/search")
    @ResponseBody
    public RespMap search(Integer id,String shelfNo){
        RespMap respMap = new RespMap(true,"","success");
        List<ShelfEntity> shelfAll = shelfService.getShelfAll();
        respMap.setResult(shelfAll);
        return respMap;
    }

    @RequestMapping("/insertAndModify")
    @ResponseBody
    public RespMap insertAndModify(ShelfEntity shelfEntity){
        RespMap respMap = new RespMap(true,"","success");
        return respMap;
    }
}
