package com.bankmanagement.bankmanagementsystem.controller;


import com.bankmanagement.bankmanagementsystem.entity.Transaction;
import com.bankmanagement.bankmanagementsystem.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    //URL://localhost:8087/transaction
    @PostMapping
public Transaction save(@RequestBody Transaction transaction){
transactionService.save(transaction);
 return transaction;
}
    //URL:localhost:8087/transaction/save-all
    @PostMapping("/save-all")
    public ResponseEntity<String> saveAll(@RequestBody List<Transaction> transactionList) {
        transactionService.saveAll(transactionList);
        return new ResponseEntity<>("transaction saved successfully", HttpStatus.CREATED);
    }

    //URL:localhost:8087/transaction/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        transactionService.delete(id);
        return ResponseEntity.ok().body("transaction deleted successfully");
    }

    //URL:localhost:8087/transaction/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Transaction> get(@PathVariable("id") Integer id) {
        Transaction transaction = transactionService.get(id);
        return ResponseEntity.ok(transaction);
    }
    //URL:localhost:8085/transaction/{id}
    @PatchMapping("/{id}")
    public ResponseEntity<String> updateTransaction(@PathVariable("id") Integer id, @RequestBody Transaction transaction) {
        transactionService.updateTransaction(id, transaction);
        return new ResponseEntity<>("Partialtransaction saved successfully", HttpStatus.CREATED);
    }

}
