package com.mr.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("pms")
public class PmsController {

    @RequestMapping("demo")
    @ResponseBody
    public void demo(){
        System.out.println("demo");
    }
}
