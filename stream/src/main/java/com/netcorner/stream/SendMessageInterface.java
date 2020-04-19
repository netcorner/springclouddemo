package com.netcorner.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by shijiufeng on 2020/4/19.
 * 创建 发送消息通道
 */
public interface SendMessageInterface {
    //创建发送消息通道
    @Output("my_stream_channel")
    SubscribableChannel sendMsg();
}
