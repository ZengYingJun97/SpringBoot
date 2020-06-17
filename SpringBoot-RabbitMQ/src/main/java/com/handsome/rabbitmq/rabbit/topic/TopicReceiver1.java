package com.handsome.rabbitmq.rabbit.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * TopicReceiver1
 *
 * @author handsome
 * @date 2020年 06月17日 23:46:01
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver1 {

	@RabbitHandler
	public void process(String content) {
		System.out.println("Receiver1: " + content);
	}
}
