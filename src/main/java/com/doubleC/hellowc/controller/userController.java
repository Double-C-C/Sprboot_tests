package com.doubleC.hellowc.controller;


import com.doubleC.hellowc.entity.User;
import com.doubleC.hellowc.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    userRepository userRepository;

    @GetMapping("/hello")
    public String sayhelloToUser(){
        return "这是用户子页面";
    }


    @PostMapping("/submit")
    public String submitPerson(@RequestBody User user){
        userRepository.save(user);
        return "你好, " + user.getName();
    }
}
