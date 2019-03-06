package com.netcorner.webui.error;

import com.netcorner.webui.utils.DALException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shijiufeng on 2019/3/2.
 */
@ControllerAdvice(basePackages = "com.netcorner.webui.controller")
public class GlobalExceptionHandler {
    private static Logger logger = Logger.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(Exception ex){
        Map<String,Object> errResultMap=new HashMap<>();
        errResultMap.put("errorCode","500");
        errResultMap.put("errorMsg",ex.getMessage());
        logger.error(ex.getMessage());
        return errResultMap;
    }
}
