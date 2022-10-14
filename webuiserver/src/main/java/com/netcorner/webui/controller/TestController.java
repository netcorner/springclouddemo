package com.netcorner.webui.controller;

import com.netcorner.webui.service.CHRecordService;
import com.netcorner.webui.utils.BaseController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @ApiOperation(value="测试redis", notes="测试redis")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "x", value = "传递是否要事务回滚，值err为要回滚其他不回滚", required = true, dataType = "String",paramType = "query")
//    })
    @ResponseBody
    @RequestMapping("/redisTest")
    public Object redisTest(){
        return chRecordService.testCache1("1");
    }

    /**
     * 测试熔断器
     * @param map
     * @return
     */

    @HystrixCommand(
              fallbackMethod = "getByIdFallback" //,
//              threadPoolProperties = { //10个核心线程池,超过20个的队列外的请求被拒绝; 当一切都是正常的时候，线程池一般仅会有1到2个线程激活来提供服务
//                @HystrixProperty(name = "coreSize", value = "10"),
//                @HystrixProperty(name = "maxQueueSize", value = "100"),
//                @HystrixProperty(name = "queueSizeRejectionThreshold", value = "20")},
//              commandProperties = {
//                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"), //命令执行超时时间
//                @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2"), //若干10s一个窗口内失败三次, 则达到触发熔断的最少请求量
//                @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "30000") //断路30s后尝试执行, 默认为5s
//             }
             )
    @ResponseBody
    @RequestMapping("/testCircuitBreaker")
    public String testCircuitBreaker(Map<String,Object> map){
        map.put("aaaaaaa",Thread.currentThread().getName());
        return "testCircuitBreaker";
    }

    public String getByIdFallback(Map<String,Object> map){
        map.put("aaaaaaa","hiFail");
        return "index ";
    }
}
