package com.devendra.sample.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserResource.class)
@AutoConfigureWebClient
public class UserResourceTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private UserResource userResource;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void whenUserResourceInjected_thenNotNull() throws Exception{
      assertThat(userResource).isNotNull();
    }
}
