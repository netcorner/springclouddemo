package com.netcorner.webui.controller;

import com.netcorner.webui.service.CHRecordService;
import com.netcorner.webui.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@Controller
public class TestController extends BaseController {
    @Autowired
    private CHRecordService chRecordService;

    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        //chRecordService.test();
        map.put("aaaaaaa",1);
        return "index";
    }





}
