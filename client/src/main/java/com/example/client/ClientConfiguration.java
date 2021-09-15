package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

  @Value("${client.config.foo}")
  private String message;

  @Bean
  public MessageProvider messageProvider() {
    return new MessageProvider(message);
  }

}
