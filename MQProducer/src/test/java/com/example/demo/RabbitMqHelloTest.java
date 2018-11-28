package com.example.demo;

import com.example.component.ProducerComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: LuHaoran
 * @Date: 18-11-27 14:39
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private ProducerComponent producerComponent;

    @Test
    public void hello() throws Exception {
        producerComponent.send();
        producerComponent.sendQA();
        producerComponent.sendQB();
    }

}
