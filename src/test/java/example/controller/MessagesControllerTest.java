package example.controller;

import example.AppBoot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppBoot.class)
@WebAppConfiguration
public class MessagesControllerTest {

  private MockMvc mvc;

  @Autowired
  private MessagesController controller;

  @Before
  public void before() throws Exception {
    mvc = MockMvcBuilders.standaloneSetup(controller).build();
  }

  @Test
  public void index() throws Exception {
    mvc.perform(get("/messages"))
      .andExpect(status().isOk());
  }
}
