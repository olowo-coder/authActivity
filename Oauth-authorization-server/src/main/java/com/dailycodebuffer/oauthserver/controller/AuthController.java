package com.dailycodebuffer.oauthserver.controller;

import com.dailycodebuffer.oauthserver.entity.User;
import com.dailycodebuffer.oauthserver.entity.UserModel;
import com.dailycodebuffer.oauthserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody UserModel userModel) {
        return userService.registerUser(userModel);
    }

    @GetMapping("/test")
    public String test(){
        return "Testing";
    }
}
