package com.qiang.springboot.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloContorller {

    @RequestMapping("/getA")
    @ResponseBody
    public String A(){
        System.out.println("sd");
        return "你就个憨批开始发售111";
    }
}
