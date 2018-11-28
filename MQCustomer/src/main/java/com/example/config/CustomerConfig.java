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
