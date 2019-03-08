package com.netcorner.mybatisdemo.controller;

import com.github.pagehelper.PageInfo;
import com.netcorner.mybatisdemo.service.CHRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@Controller
public class TestController {
    @Autowired
    private CHRecordService chRecordService;

    @RequestMapping("/index")
    public String index(Map<String,Object> map){
        PageInfo<Map<String,Object>> pageInfo= chRecordService.finder(map);
        map.put("list",pageInfo);
        //chRecordService.weekSignalTimeRoomStat()
        return "index";
    }
}
