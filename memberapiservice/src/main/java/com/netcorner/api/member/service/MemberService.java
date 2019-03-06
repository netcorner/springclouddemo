package com.netcorner.api.member.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shijiufeng on 2019/2/24.
 */
public interface MemberService {
    @RequestMapping("/getInfo")
    String getInfo();
}
