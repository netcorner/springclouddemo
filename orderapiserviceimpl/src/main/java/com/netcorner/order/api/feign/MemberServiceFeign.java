package com.netcorner.order.api.feign;

import com.netcorner.api.member.service.MemberService;
import com.netcorner.order.api.fallback.MemberServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by shijiufeng on 2019/2/23.
 */
@FeignClient(name="service-member",fallback = MemberServiceFallback.class)
public interface MemberServiceFeign extends MemberService {

}
