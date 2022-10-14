package com.netcorner.api.order.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shijiufeng on 2019/2/24.
 */
public interface OrderService {
    @GetMapping("/payment")
    String payment();

    @GetMapping("/addcart")
    String addcart();

    @GetMapping("/addcartOther")
    String addcartOther();
}
