package example.model;

import java.io.Serializable;

public class Message implements Serializable {

  private String name;

  // for jackson
  public Message() {
  }

  public Message(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
