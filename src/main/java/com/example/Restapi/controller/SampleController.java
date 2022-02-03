package com.example.Restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.Restapi.models.Message;
@RestController
public class SampleController {
    @RequestMapping("/sample")
    public Message Sample(@RequestParam(value = "name",
            defaultValue = "Abhinav") String name) {
        Message response = new Message();
        response.setId(1);
        response.setMessage("Your name is "+name);
        return response;
    }

}
