package com.handsome.rabbitmq.rabbit.user;

import com.handsome.rabbitmq.pojo.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * UserReceiver
 * @author handsome
 * @date 2020年 06月17日 23:25:00
 */
@Component
@RabbitListener(queues = "user")
public class UserReceiver {

	@RabbitHandler
	public void process(User user) {
		System.out.println("Receiver user : " + user);
	}
}
