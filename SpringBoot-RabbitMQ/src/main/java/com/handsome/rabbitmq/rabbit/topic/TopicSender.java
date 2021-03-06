package com.handsome.rabbitmq.rabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TopicSender
 * @author handsome
 * @date 2020年 06月17日 23:43:42
 */
@Component
public class TopicSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send1() {
		String context = "hi, i am message 1";
		System.out.println("Sender : " + context);
		rabbitTemplate.convertAndSend("exchange", "topic.message", context);
	}

	public void send2() {
		String context = "hi, i am messages 2";
		System.out.println("Sender : " + context);
		rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
	}
}
