package com.netcorner.member.api.serviceImp;

import com.netcorner.api.member.service.MemberService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Override
    public String getInfo() {
        return  "张三";
    }
}
