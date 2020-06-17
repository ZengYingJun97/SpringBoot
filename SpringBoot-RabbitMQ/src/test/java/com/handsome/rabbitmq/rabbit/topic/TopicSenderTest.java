package com.handsome.rabbitmq.rabbit.topic;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TopicSenderTest {

	@Autowired
	private TopicSender topicSender;

	@Test
	void send1() {
		topicSender.send1();
	}

	@Test
	void send2() {
		topicSender.send2();
	}
}