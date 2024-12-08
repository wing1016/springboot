package com.demo.restapi.demo_rest_api;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.demo.restapi.demo_rest_api.service.UserService;

//@SpringBootTest // Full scale of Spring Context // hold server test environment . here is no need
@WebMvcTest // A test spring env, 
            // consist of web related beans + some other beans
            // for test (MockMvc)
public class BankUserControllerTest {

  //to test controller here !!!


  //MockBean ( whole bean is false )    // SpyBean ( whole bean is real except one mock method is false) !!!

  @Autowired
  private MockMvc mockMvc; // like Postman

  //! @ Mock <= this is not bean ( you can still use when , but cannot put into context ),  
  //  @Autowired <= this is really context
  @MockBean 
  private UserService userService;

  @Test 
  void testGetUserByUserName(){
    //postman -> URL -> SpringBoot Controller -> Service


    // Assumption 

    //sir

    Mockito.when(userService.getUserById(null))

    //sir


    //Test
    this.mockMvc.perform(MockMvcRequestBuilders.get("/users").param("userName","John"))
    .andExpect(MockMvcResultMatchers.status().isOk())
    .andExpect(MockMvcResultMatchers.jsonPath("$.code", Matchers.is("000000")))
    .andExpect(MockMvcResultMatchers.jsonPath("$.message", Matchers.is("Success.")))
    .andExpect(MockMvcResultMatchers.jsonPath("$.data.[*].name").value(Matchers.hasItem("Betty")));

    //sir
  }
  
}
