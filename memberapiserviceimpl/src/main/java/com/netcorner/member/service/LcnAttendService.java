package com.netcorner.member.service;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by shijiufeng on 2019/3/8.
 */
@Service
public class LcnAttendService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @LcnTransaction
    @Transactional
    public String rpc() {
        jdbcTemplate.execute("insert into b(a) values('123') ");
        return "ok";
    }
}
