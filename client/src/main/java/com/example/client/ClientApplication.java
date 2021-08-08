package com.example.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	private static final Logger LOG = LoggerFactory.getLogger(ClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(
			@Value("${client.config.foo}") String foo,
			@Value("${client.config.yada}") String yada
	) {
		return args -> {
			LOG.info(foo);
			LOG.info(yada);
		};
	}

}
