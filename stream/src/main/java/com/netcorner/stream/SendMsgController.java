package com.netcorner.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by shijiufeng on 2020/4/19.
 */
@RestController
public class SendMsgController {
    @Autowired
    protected SendMessageInterface sendMessageInterface;
    //生产者流程
    //1.创建发送消息通道
    //2.生产者投递消息
    //3.开启绑定（结合）
    @RequestMapping("/sendMsg")
    public String sendMsg(){
        Map<String,Object> hash=new HashMap<>();
        String msg= UUID.randomUUID().toString();
        hash.put("msg",msg);
        System.out.println("生产者发送内容 Msg:"+msg);
        Message build= MessageBuilder.withPayload(hash).build();
        sendMessageInterface.sendMsg().send(build);
        return "sucess";
    }

}
