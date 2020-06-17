package com.handsome.rabbitmq.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * TopicReceiver2
 *
 * @author handsome
 * @date 2020年 06月17日 23:46:14
 */
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {

	@RabbitHandler
	public void process(String content) {
		System.out.println("Receiver2: " + content);
	}
}
