package com.example.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @Auther: LuHaoran
 * @Date: 18-11-27 14:36
 * @Description:
 */
@Component
public class CustomerComponent {


    /**
     * 监听器监听指定的Queue
     */
    @RabbitListener(queues="qTest")
    public void processCustomer(String str) {
        System.out.println("Receive:"+str);
    }

    @RabbitListener(queues="QUEUE_A")
    public void qA(String str) {
        System.out.println("Receive:"+str);
    }

    @RabbitListener(queues="QUEUE_B")
    public void qB(String str) {
        System.out.println("Receive:"+str);
    }

}
