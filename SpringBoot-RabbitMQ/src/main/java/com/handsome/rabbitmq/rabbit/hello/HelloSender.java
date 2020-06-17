package com.handsome.rabbitmq.rabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * HelloSender
 *
 * @author handsome
 * @date 2020年 06月16日 22:23:23
 */
@Component
public class HelloSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String content = "hello" + new Date();
		System.out.println("Sender: " + content);
		rabbitTemplate.convertAndSend("hello", content);
	}

	public void send(int i) {
		String context = "hello queue"+" ****** "+i;
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("hello", context);
	}
}
