package com.handsome.rabbitmq.rabbit.user;

import com.handsome.rabbitmq.pojo.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * UserSender
 *
 * @author handsome
 * @date 2020年 06月17日 23:23:28
 */
@Component
public class UserSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(User user) {
		System.out.println("Sender user: " + user.toString());
		rabbitTemplate.convertAndSend("user", user);
	}
}
