package com.Gruuy.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserHandler {
    @RequestMapping("/HelloWorld")
    public String Hello(){
        System.out.println("进来了！");
        return "Hi";
    }
}
