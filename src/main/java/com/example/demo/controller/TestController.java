package com.example.demo.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "hello world!";
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
}
