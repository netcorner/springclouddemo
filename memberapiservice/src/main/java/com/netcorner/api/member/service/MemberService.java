package com.netcorner.api.member.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shijiufeng on 2019/2/24.
 */
public interface MemberService {
    @GetMapping("/getInfo")
    String getInfo();
    @GetMapping("/register")
    String register();
}
