package com.bankmanagement.bankmanagementsystem.controller;



import com.bankmanagement.bankmanagementsystem.entity.Account;
import com.bankmanagement.bankmanagementsystem.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    //    @Autowired
//    private AccountService accountService;
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    //URL:localhost:8085/account
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Account account) {
        accountService.save(account);
        return new ResponseEntity<>("account saved successfully", HttpStatus.CREATED);
    }

    //URL:localhost:8085/account/save-all
    @PostMapping("/save-all")
    public ResponseEntity<String> saveAll(@RequestBody List<Account> accountList) {
        accountService.saveAll(accountList);
        return new ResponseEntity<>("account saved successfully", HttpStatus.CREATED);
    }


    //URL:localhost:8085/account/{accountid}
    @DeleteMapping("/{accountid}")
    public ResponseEntity<String> delete(@PathVariable("accountid") Integer accountid) {
        accountService.delete(accountid);
        return ResponseEntity.ok().body("account deleted successfully");
    }


    //URL:localhost:8085/account/{accountid}
    @GetMapping("/{accountid}")
    public ResponseEntity<Account> get(@PathVariable("accountid") Integer accountid) {
        Account account = accountService.get(accountid);
        return ResponseEntity.ok(account);
    }

    //URL:localhost:8085/account/{accountid}
    @PatchMapping("/{accountid}")
    public ResponseEntity<String> updateAccount(@PathVariable("accountid") Integer accountid, @RequestBody Account account) {
        accountService.updateAccount(accountid, account);
        return new ResponseEntity<>("Partialaccount saved successfully", HttpStatus.CREATED);
    }

    //URL:localhost:8086/account
    @PutMapping
    public ResponseEntity<String> updateAccount(@RequestBody Account account) {
       accountService.updateFullAccount(account);
        return new ResponseEntity<>("Full account updated successfully", HttpStatus.CREATED);

    }
}
