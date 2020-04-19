package com.netcorner;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * Created by shijiufeng on 2020/4/19.
 * 创建 发送消息通道
 */
@Component
public class Customer {
    //创建发送消息通道
    @StreamListener("my_stream_channel")
    public void readMsg(String msg){
        System.out.println("消费者获取生产者投递："+msg);
    }
}
