package com.mr.erp_user.rabbitmq;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RabbitMqUtils {

    @Autowired
    private RabbitMessagingTemplate rabbitMessagingTemplate;


    public void sendMessage(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","xiaolei");
        map.put("price",100000);
        try{
            rabbitMessagingTemplate.convertAndSend("exchange11905", "demo11905", JSON.toJSONString(map));
            System.out.println("发送成功");
        }catch (Exception e){
            System.out.println("发送失败");
        }
    }
}
