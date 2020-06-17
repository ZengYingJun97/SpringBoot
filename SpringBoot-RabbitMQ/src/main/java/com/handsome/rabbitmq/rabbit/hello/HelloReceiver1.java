package com.handsome.rabbitmq.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * HelloReceiver1
 *
 * @author handsome
 * @date 2020年 06月17日 23:10:39
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver1 {

	@RabbitHandler
	public void process(String hello) {
		System.out.println("Receiver1: " + hello);
	}
}
