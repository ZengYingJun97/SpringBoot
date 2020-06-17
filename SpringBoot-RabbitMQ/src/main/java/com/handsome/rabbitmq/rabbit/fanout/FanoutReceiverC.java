package com.handsome.rabbitmq.rabbit.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * FanoutReceiverC
 *
 * @author handsome
 * @date 2020年 06月17日 23:58:32
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {

	@RabbitHandler
	public void process(String message) {
		System.out.println("fanout Receiver C  : " + message);
	}
}
