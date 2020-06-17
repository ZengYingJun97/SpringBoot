package com.handsome.rabbitmq.rabbit.hello;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSenderTest {

	@Autowired
	private HelloSender helloSender;

	@Autowired
	private HelloSender1 helloSender1;

	@Test
	void send() {
		helloSender.send();
	}

	@Test
	void testSend() {
		for (int i=0;i<100;i++){
			helloSender.send(i);
		}
	}

	@Test
	void manyToMany() {
		for (int i=0;i<100;i++){
			helloSender.send(i);
			helloSender1.send(i);
		}
	}
}