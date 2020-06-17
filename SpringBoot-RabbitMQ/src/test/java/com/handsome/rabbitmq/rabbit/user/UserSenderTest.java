package com.handsome.rabbitmq.rabbit.user;

import com.handsome.rabbitmq.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserSenderTest {

	@Autowired
	private UserSender userSender;

	@Test
	void send() {
		User user = new User();
		user.setUsername("handsome");
		user.setPassword("handsome");
		userSender.send(user);
	}
}