package example;

import example.client.api.HelloApi;
import example.client.api.MessagesApi;
import example.client.invoker.ApiClient;
import example.client.invoker.ApiException;
import example.client.model.Message;
import org.junit.Test;

import javax.ws.rs.ProcessingException;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class LocalServerTest {

  private static final ApiClient localServerClient = new ApiClient().setBasePath("http://localhost:8080/");

  @Test
  public void hello() throws ApiException {
    HelloApi api = new HelloApi(localServerClient);
    Map<String, String> result = api.index();
    assertThat(result.get("message"), is("Hello, World!"));
  }

  @Test(expected = ProcessingException.class)
  public void hello_ConnectionRefused() throws ApiException {
    HelloApi api = new HelloApi(new ApiClient().setBasePath("http://localhost:8081/"));
    api.index();
  }

  @Test
  public void replyTo() throws ApiException {
    HelloApi api = new HelloApi(localServerClient);
    Map<String, String> result = api.replyTo("What's up?");
    assertThat(result.get("message"), is("Wow, you said 'What's up?'. Thanks!"));
  }

  @Test(expected = ApiException.class)
  public void replyTo_BadRequest() throws ApiException {
    HelloApi api = new HelloApi(localServerClient);
    api.replyTo(null);
  }

  @Test
  public void replyTo_BadRequest_ExceptionDetails() {
    HelloApi api = new HelloApi(localServerClient);
    try {
      api.replyTo(null);
    } catch (ApiException e) {
      assertThat(e.getCode(), is(400));
      assertThat(e.getMessage(), is("Missing the required parameter 'message' when calling replyTo"));
      assertThat(e.getResponseBody(), is(nullValue()));
    }
  }

  @Test
  public void messages() throws ApiException {
    MessagesApi api = new MessagesApi(localServerClient);
    List<Message> messages = api.showMessages();
    assertThat(messages.size(), is(3));
  }


}
