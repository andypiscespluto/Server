package com.example.myserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;

@Controller
//Controller允许这个类接收前端的请求
//能自动识别扫描当前的类，把他作为spring的一个bean去管理
public class WebController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name")String name, Model model){
        model.addAttribute("name",name);//获取来自浏览器的值
        return "hello";//能够去模板目录自动去寻找hello这个模板
    }
}
