package com.netcorner.order.api.fallback;

import com.netcorner.order.api.feign.MemberServiceFeign;
import org.springframework.stereotype.Component;

/**
 * Created by shijiufeng on 2019/2/24.
 */
@Component
public class MemberServiceFallback implements MemberServiceFeign {

    @Override
    public String getInfo() {
        return "个人信息暂无法访问，请稍后再试";
    }

    @Override
    public String register() {
        return "暂时无法注册用户";
    }
}
