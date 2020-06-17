package com.handsome.rabbitmq.rabbit.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FanoutReceiverB
 *
 * @author handsome
 * @date 2020年 06月17日 23:58:21
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {

	@RabbitHandler
	public void process(String message) {
		System.out.println("fanout Receiver B  : " + message);
	}
}
