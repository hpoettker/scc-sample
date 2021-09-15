package com.example.client;

public class MessageProvider {

  private final String message;

  public MessageProvider(final String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
