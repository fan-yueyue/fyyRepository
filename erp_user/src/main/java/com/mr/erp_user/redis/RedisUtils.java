package com.mr.erp_user.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class RedisUtils implements Serializable {
    @Autowired
    private RedisTemplate redisTemplate;


    public void  setKeyValue(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }




    public void setList(String key, List<Object> list){
        redisTemplate.opsForList().set(key,0,list);
    }

    public void setHash(String key, String item, Object obj){
        redisTemplate.opsForHash().put(key,item,obj);

    }


    public Object getHash(String key, String item){
       return redisTemplate.opsForHash().get(key,item);
    }



}
