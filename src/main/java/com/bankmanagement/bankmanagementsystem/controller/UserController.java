package com.bankmanagement.bankmanagementsystem.controller;

import com.bankmanagement.bankmanagementsystem.entity.User;
import com.bankmanagement.bankmanagementsystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    //url:localhost:8087/user
    @PostMapping
    public ResponseEntity<User> save(@Valid  @RequestBody User user){
        return ResponseEntity.ok().body(user);
    }
    @PostMapping("/login")
    public ResponseEntity<User> checkValidUser(@Valid  @RequestBody User user){
        return ResponseEntity.ok().body(user);
    }


}
