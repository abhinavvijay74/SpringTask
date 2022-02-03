package com.example.Restapi.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(SampleController.class)
@ExtendWith(SpringExtension.class)
class SampleControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void hello()
    {
        RequestBuilder request= MockMvcRequestBuilders.get("/hello");
        MvcResult result=mvc.perform(request).andReturn();
        assertEquals("Hello,World",result.getResponse().getContentAsString());
    }
}