package org.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = TestController.class)
public class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void test_테스트() throws Exception {
        String test = "test";

        mvc.perform(get("/api/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(test));
    }
}
