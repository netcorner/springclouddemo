package com.netcorner.order.service;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.netcorner.order.api.feign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by shijiufeng on 2019/3/8.
 */
@Service
public class LcnService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @LcnTransaction
    @Transactional
    public String execute(String i) {

            String dResp = memberServiceFeign.register();
            jdbcTemplate.execute("insert into a(a) values('111') ");



            if(i.equals("err")) {
                throw new IllegalStateException("by exFlag");
            }else {
                return "123";
            }

    }
}
