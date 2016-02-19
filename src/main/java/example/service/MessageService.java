package example.service;

import example.model.Message;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {

  private static final List<Message> MESSAGES = Arrays.asList(
    new Message("Hello"),
    new Message("Good morning"),
    new Message("Bye")
  );

  public List<Message> findAll() {
    return MESSAGES;
  }
}
