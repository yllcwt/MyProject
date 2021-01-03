package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(String id){
        return "hello world!"+ id;
    }

    @GetMapping("update")
    public String update() {
        return "update";
    }
    @GetMapping("delete")
    public String delete(Model model){
        Map<String, Integer> map = new HashMap<>();
        map.put("a",2);
        model.addAllAttributes(map);
        return "delete";
    }
    @GetMapping("select")
    public String select(Model model){
        Map<String, Integer> map =new HashMap<>();
        map.put("a", 2);
        model.addAttribute("map", map);
//        Map<String, Integer> m = (Map<String, Integer>) model.getAttribute("map");
        return "this is a"+ model.getAttribute("map");
    }
    @RequestMapping("/success")
    public String success(Map<Object, String> map){
        map.put("hello", "nihao");
        return "blank_page";
    }

    @RequestMapping("/fail")
    public String fail(Map<Object, String> map){
        map.put("hello", "world");
        return "test";
    }
}
