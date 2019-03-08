package com.netcorner.mybatisdemo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.netcorner.mybatisdemo.mapper.CHRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by shijiufeng on 2019/3/2.
 */
@Service
public class CHRecordService {
    @Autowired
    private CHRecordMapper chRecordMapper;

    public PageInfo<Map<String,Object>>  finder(Map<String,Object> params){
        PageHelper.startPage(1,2);
        List<Map<String,Object>> list= chRecordMapper.finder(params);
        PageInfo<Map<String,Object>> pageInfo=new PageInfo<Map<String,Object>>(list);
        return pageInfo;
    }

}
