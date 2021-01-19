package com.devendra.sample.web;

import com.devendra.sample.domain.User;
import com.devendra.sample.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserResource.class)
@AutoConfigureWebClient
public class UserResourceTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private UserResource userResource;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private UserService userService;

    private User userReqBody;
    @Before
    public void setUp() throws Exception {
        userReqBody = new User();
        userReqBody.setFirstName("BBB");
    }

    @Test
    public void whenUserResourceInjected_thenNotNull() throws Exception{
      assertThat(userResource).isNotNull();
    }
/*    @Test
    public void whenValidUrlAndMethodAndInvalidContentType_thenReturn400() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/user/")
                .header("Content-Type","application/json")
                .contentType("application/json;charset=UTF-8")
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }*/

    @Test
    public void whenValidUrlAndMethodAndValidContentType_thenGetRequestShouldReturn200() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("/user/")
                .header("Content-Type","application/json")
                .contentType("application/json;charset=UTF-8")
                .accept("application/json;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void whenValidUrlAndMethodAndContentType_thenPostRequestShouldReturns200() throws  Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.post("/user/")
                .header("Content-Type","application/json")
                .contentType("application/json;charset=UTF-8")
                .accept("application/json;charset=UTF-8")
                .content(objectMapper.writeValueAsString(userReqBody)))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }




}
