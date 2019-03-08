package com.netcorner.jspandvelocitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(Map<String,Object> map){

        return "index";
    }
    @RequestMapping("/test")
    public String test(Map<String,Object> map){

        return "test";
    }
}
