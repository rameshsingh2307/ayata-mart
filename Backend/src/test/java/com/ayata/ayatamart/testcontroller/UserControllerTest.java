
package com.ayata.ayatamart.testcontroller;

import static com.ayata.ayatamart.controller.Status.SUCCESS;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import com.ayata.ayatamart.controller.Status;
import com.ayata.ayatamart.controller.UserController;
import com.ayata.ayatamart.dto.UserResponse;
import com.ayata.ayatamart.model.User;
import com.ayata.ayatamart.service.UserService;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @MockBean
    UserService userService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testLogin() throws Exception {
        User user = new User("ramesh.singh@ayatacommerce", "Gupta");
        UserResponse userResponse = new UserResponse(SUCCESS, "123456");

        Mockito.when(userService.returnMethod(user)).thenReturn(userResponse);

        mockMvc.perform(get("/users/login"))
                .andExpect(status().isOk());
    }

    @Autowired
    UserService userService1;

    @Test
    public void testLogin1() throws Exception {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/users/login";

        User user = new User("ramesh.singh@ayatacommerce", "Gupta");

        ResponseEntity<User> entity = restTemplate.postForEntity(url, user, User.class);

        //Assertions.assertThat(entity).equals(SUCCESS);
    }
}