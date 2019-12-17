package com.mr.erp_user.controller.consumer;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration   //相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器 用在类上作为配置类 与bean 一同使用
public class TopicConfig {

    @Bean  // 排队
    public Queue coreQueue() {
        return new Queue("queue1905");
    }

    @Bean   //交换
    public TopicExchange coreExchange() {
        return new TopicExchange("exchange11905");
    }

    @Bean
    public Binding bindCoreQueueExchange(Queue coreQueue, TopicExchange coreExchange) {
        return BindingBuilder.bind(coreQueue).to(coreExchange).with("demo11905");
                //绑定生成器                                             //路由 的key  它是键值对方式
    }
}
