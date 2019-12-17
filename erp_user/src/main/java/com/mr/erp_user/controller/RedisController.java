package com.mr.erp_user.controller;

import com.mr.erp_user.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("redis")
public class RedisController {
    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("testRedis")
    public Map<String,Object> testRedis(){
        Map<String, Object> map = new HashMap<>();
        map.put("age",18);
        map.put("home","shandong");
        map.put("like","lvse");
         redisUtils.setHash("1905","xiaolei",map);

        Map<String,Object> xiaolei = (Map<String, Object>) redisUtils.getHash("1905", "xiaolei");
        return xiaolei;
    }

}
