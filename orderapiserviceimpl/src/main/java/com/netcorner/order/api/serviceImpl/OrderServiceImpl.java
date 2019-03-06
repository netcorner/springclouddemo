package com.netcorner.order.api.serviceImpl;

import com.netcorner.api.order.service.OrderService;
import com.netcorner.order.api.feign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
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
}
