package com.mr.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class MongodbUtils {

    @Autowired
    private MongoTemplate mongoTemplate;

    //增加
    public void saveMongo(Object entity, String collectionName) {
        mongoTemplate.save(entity, collectionName);

    }

    //查询方法
    public Object slelctMongo(Object entity, Query query) {
        Object test = mongoTemplate.findOne(query, entity.getClass(), "test");
        return test;
    }


    //删除方法
    public void deleteMongo(String key,Query query) {
        mongoTemplate.remove(query,key);
    }

    //修改方法
    public void updateMongo(Query query, Update update, String key) {
        mongoTemplate.updateFirst(query,update,key);
    }


}
