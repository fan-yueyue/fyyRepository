package com.mr.erp_user.controller;

import com.mr.erp_user.rabbitmq.RabbitMqUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rabbit")
public class RabbitController {
    @Autowired
    private RabbitMqUtils rabbitMqUtils;

    @GetMapping("testRabbite")
    public void testRabbite(){
        rabbitMqUtils.sendMessage();
    }
}
