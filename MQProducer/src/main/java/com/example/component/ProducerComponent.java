package com.example.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @Auther: LuHaoran
 * @Date: 18-11-27 14:36
 * @Description:
 */
@Component
public class ProducerComponent {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("qTest","RabbitMQ_Test");
    }

    public void sendQA(){
        template.convertAndSend("QUEUE_A" , "QUEUE_A......");
    }


    public void sendQB(){
        template.convertAndSend("QUEUE_B" , "QUEUE_B......");
    }
}
