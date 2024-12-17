package com.bankmanagement.bankmanagementsystem.repository;


import com.bankmanagement.bankmanagementsystem.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface  TransactionRepository extends JpaRepository<Transaction, Integer> {

    }

