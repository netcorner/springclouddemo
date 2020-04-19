package com.netcorner;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by shijiufeng on 2020/4/19.
 * 创建 发送消息通道
 */
public interface ReadMessageInterface {
    //创建发送消息通道
    @Input("my_stream_channel")
    SubscribableChannel readMsg();
}
