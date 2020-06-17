package com.handsome.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitConfig
 *
 * @author handsome
 * @date 2020年 06月16日 22:16:43
 */
@Configuration
public class RabbitConfig {

	@Bean
	public Queue Queue() {
		return new Queue("hello");
	}

	@Bean
	public Queue userQueue() {
		return new Queue("user");
	}
}