package com.netcorner.order.api.serviceImpl;

import com.netcorner.api.order.service.OrderService;
import com.netcorner.order.api.feign.MemberServiceFeign;
import com.netcorner.order.service.LcnService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@RestController
public class OrderServiceImpl implements OrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;


    @Override
    public String payment() {
        return "开始支付";
    }

    @Override
    public String addcart() {
        System.out.println(""+Thread.currentThread().getName());
        return memberServiceFeign.getInfo()+"开始将商品加入购物车！";
    }


    /**
     * 以下是不通过feign的方式访问接口
     */
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String addcartOther() {

        return restTemplate.getForEntity("http://service-member/getInfo", String.class).getBody();
    }
    @Autowired
    private LcnService lcnService;




    /**
     * 测试分布式事务,@RequestMapping 会把所有http请求类型加上去采用@GetMapping只限定get请求了
     * @return
     */
    @ApiOperation(value="测试分布式事务", notes="测试分布式事务")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "x", value = "传递是否要事务回滚，值err为要回滚其他不回滚", required = true, dataType = "String",paramType = "query")
    })
    @RequestMapping("/txlcn")
    public String execute(String x) {
        return lcnService.execute(x)+"";
    }
}
