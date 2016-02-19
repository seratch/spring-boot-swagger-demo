package example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;
import example.model.Message;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.List;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * RestAssured testing examples.
 *
 * @see 'https://github.com/FutureProcessing/spring-boot-security-example/blob/master/src/test/java/com/futureprocessing/integration/SecurityTest.java'
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppBoot.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class RestAssuredTests {

  private static final Logger logger = LoggerFactory.getLogger(RestAssuredTests.class);

  @Value("${local.server.port}")
  int localServerPort;

  @Before
  public void setup() {
    RestAssured.baseURI = "http://localhost";
    RestAssured.port = localServerPort;
  }

  @Test
  public void contextLoads() {
  }

  @Test
  public void index() {
    RequestSpecification spec =
      given();

    spec.when()
      .get("/hello")
      .then()
      .statusCode(200)
      .body("message", equalTo("Hello, World!"));
  }

  @Test
  public void replyToValidMessage() {
    RequestSpecification spec =
      given()
        .parameters("message", "How are you doing?");

    spec.when()
      .post("/hello")
      .then()
      .statusCode(200)
      .body("message", equalTo("Wow, you said 'How are you doing?'. Thanks!"));
  }

  @Test
  public void replyToInvalidMessage() {
    RequestSpecification spec =
      given();

    spec.when()
      .post("/hello")
      .then()
      .statusCode(400)
      .body("message", equalTo("Required String parameter 'message' is not present"));
  }

  @Test
  public void messages() {
    RequestSpecification spec =
      given();

    spec.when()
      .get("/messages")
      .then()
      .statusCode(200)
      .body(new BaseMatcher<String>() {
        @Override
        public void describeTo(Description description) {
          description.appendText("messages API response verification");
        }

        @Override
        public boolean matches(Object obj) {
          String actualBody = (String) obj;
          try {
            List<Message> messages = new ObjectMapper().readValue(actualBody, new TypeReference<List<Message>>() {
            });
            return messages.size() == 3;
          } catch (IOException e) {
            logger.error(e.getMessage(), e);
            return false;
          }
        }
      });
  }

}
