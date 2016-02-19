package example.controller;

import com.google.common.collect.ImmutableMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
// https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X#api
@Api(description = "saying hello", tags = "hello")
public class HelloController {

  @RequestMapping(
    method = RequestMethod.GET,
    path = "/hello",
    produces = "application/json")
  // https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X#api
  @ApiOperation(
    nickname = "index", // To avoid indexUsingGET in ApiClient
    value = "Says hello to you",
    notes = "This endpoint just tells you a greeting message.<br/>" +
      "See also: https://en.wikipedia.org/wiki/%22Hello,_World!%22_program")
  public Map<String, String> index() {
    return ImmutableMap.<String, String>builder().put("message", "Hello, World!").build();
  }

  @RequestMapping(
    method = RequestMethod.POST,
    path = "/hello",
    consumes = "application/x-www-form-urlencoded",
    produces = "application/json")
  @ApiOperation(
    nickname = "replyTo", // To avoid replyToUsingGET in ApiClient
    value = "Replies to your message",
    notes = "This endpoint just replies to your message.")
  public Map<String, String> replyTo(@RequestParam(required = true) String message) {
    return ImmutableMap.<String, String>builder().put("message", "Wow, you said '" + message + "'. Thanks!").build();
  }

}
