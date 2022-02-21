package com.spray.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestWebController {

    @RequestMapping("/name")
    public String name(String name) {
        System.out.println("测试通过！"+name);
        return "ok";
    }

    @RequestMapping("/test")
    public String test() {
        System.out.println("测试通过!！");
        return "ok";
    }

}
