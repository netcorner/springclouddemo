package com.netcorner.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by shijiufeng on 2019/3/2.
 */
public interface CHRecordMapper {
//    @Select("SELECT*FROM t_ch_rec2")
//    List<Map<String,Object>> finder(@Param(value="map")Map<String,Object> params);

   List<Map<String,Object>> finder(@Param(value="map")Map<String,Object> params);

    //List<Map<String,Object>> weekSignalTimeRoomStat(@Param(value = "map") Map<String, Object> params);
}
