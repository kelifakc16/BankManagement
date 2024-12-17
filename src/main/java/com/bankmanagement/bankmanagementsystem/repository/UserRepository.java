package com.bankmanagement.bankmanagementsystem.repository;

import com.bankmanagement.bankmanagementsystem.entity.Transaction;
import com.bankmanagement.bankmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//public class UserRepository  {
//    public void save(User user){
//        System.out.println(user);
//    }
//
//}
public interface  UserRepository extends JpaRepository<User, Integer> {

}
