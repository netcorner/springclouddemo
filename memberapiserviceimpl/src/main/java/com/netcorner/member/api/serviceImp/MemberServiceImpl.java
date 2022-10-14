package com.netcorner.member.api.serviceImp;

import com.netcorner.api.member.service.MemberService;
import com.netcorner.member.service.LcnAttendService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @ApiOperation(value="得到会员信息", notes="得到会员详细信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",paramType = "path"),
//            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
//    })
    @Override
    public String getInfo() {
        return  "张三";
    }

    @Autowired
    private LcnAttendService lcnAttendService;



    @ApiOperation(value="会员注册", notes="根据相关信息进行会员注册")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long",paramType = "path"),
//            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
//    })
    @Override
    public String register() {
        return lcnAttendService.rpc();
    }
}
