package com.example.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: LuHaoran
 * @Date: 18-11-27 14:35
 * @Description:
 */
@Configuration
public class CustomerConfig {

    /**
     * qTest , QUEUE_A , QUEUE_B是不同的通道,接收对应的通道信息
     * 通道名称与监听的名称必须一致
     *
     */
    @Bean
    public Queue queue() {
        return new Queue("qTest");
    }

    @Bean
    public Queue queueA() {
        return new Queue("QUEUE_A");
    }

    @Bean
    public Queue queueB() {
        return new Queue("QUEUE_B");
    }
}
