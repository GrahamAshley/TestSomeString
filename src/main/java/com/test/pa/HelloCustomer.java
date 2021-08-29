package com.test.pa;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author 101217
 * @Date 2021/7/2
 * @Version 1.0
 */
@Component
//@RabbitListener 这个注解代表消费者的 一个监听
//消费者监听hello队列

public class HelloCustomer {
    //消费者 - 消费 - 提供者 的消息
    @RabbitListener(queuesToDeclare = @Queue(value = "illegal.dlx.queue"))
    public void receival(String message){
        System.out.println("消费接收到了消息----->"+message);
    }
}
