package com.bankmanagement.bankmanagementsystem.service;

import com.bankmanagement.bankmanagementsystem.entity.Account;
import com.bankmanagement.bankmanagementsystem.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
// @Autowired
//    private AccountRepository accountRepository;
    private final AccountRepository accountRepository;
    public AccountService(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }


    public void save(Account account){
     accountRepository.save(account);
    }

    public void saveAll(List<Account> accountList){
        accountRepository.saveAll(accountList);
    }



    public void delete(Integer accountid){
        accountRepository.deleteById(accountid);
    }
    public Account get(Integer accountid){
        Optional<Account> accountOptional= accountRepository.findById(accountid);
        if (accountOptional.isPresent()){
            return accountOptional.get();
        }else{
            throw new RuntimeException("Account not found");
        }
    }
public void updateAccount(Integer accountid,Account account){
Account existingAccount= accountRepository.findById(accountid)
        .orElseThrow(()->new RuntimeException("Account not found"+accountid));
if(account.getAccountid()!=null){
    existingAccount.setAccountid(account.getAccountid());
}
    if(account.getAccountHolderName()!=null){
        existingAccount.setAccountHolderName(account.getAccountHolderName());
    }
    if(account.getAccountType()!=null){
        existingAccount.setAccountType(account.getAccountType());
    }


    accountRepository.save(existingAccount);
        }
public void updateFullAccount(Account account){
        Account existingAccount=accountRepository.findById(account.getAccountid())
                .orElseThrow(()->new RuntimeException("Account not found for id"+account.getAccountid()));
        existingAccount.setAccountType(account.getAccountType());
        existingAccount.setAccountid(account.getAccountid());
        existingAccount.setAccountHolderName(account.getAccountHolderName());
        accountRepository.save(existingAccount);
}
}
