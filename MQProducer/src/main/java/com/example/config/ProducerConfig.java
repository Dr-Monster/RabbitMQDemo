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
public class ProducerConfig {
    @Bean
    public Queue queue() {
        return new Queue("qTest");
    }
}
