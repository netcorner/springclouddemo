package com.netcorner.api.order.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shijiufeng on 2019/2/24.
 */
public interface OrderService {
    @RequestMapping("/payment")
    String payment();

    @RequestMapping("/addcart")
    String addcart();

    @RequestMapping("/addcartOther")
    String addcartOther();
}
