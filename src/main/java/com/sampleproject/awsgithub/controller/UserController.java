package com.sampleproject.awsgithub.controller;

import com.sampleproject.awsgithub.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {
    @GetMapping("/")
    public Message getGreetings(){
        return new Message("Hello Deepak, Good Morning !");
    }
}
