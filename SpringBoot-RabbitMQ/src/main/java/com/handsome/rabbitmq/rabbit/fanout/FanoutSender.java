package com.handsome.rabbitmq.rabbit.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FanoutSender
 * @author handsome
 * @date 2020年 06月17日 23:54:42
 */
@Component
public class FanoutSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "hi, fanout msg ";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
	}
}
