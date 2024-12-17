package com.bankmanagement.bankmanagementsystem.service;

import com.bankmanagement.bankmanagementsystem.entity.Transaction;
import com.bankmanagement.bankmanagementsystem.entity.User;
import com.bankmanagement.bankmanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void save( User user){
        userRepository.save(user);

    }
}
