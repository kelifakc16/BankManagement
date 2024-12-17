package com.bankmanagement.bankmanagementsystem.service;


import com.bankmanagement.bankmanagementsystem.entity.Transaction;
import com.bankmanagement.bankmanagementsystem.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository=transactionRepository;
    }
public void save(Transaction transaction){
        transactionRepository.save(transaction);

}
    public void saveAll(List<Transaction> transactionList){
        transactionRepository.saveAll(transactionList);
    }
    public void delete(Integer id){
        transactionRepository.deleteById(id);
    }
    public Transaction get(Integer id){
        Optional<Transaction> transactionOptional= transactionRepository.findById(id);
        if (transactionOptional.isPresent()){
            return transactionOptional.get();
        }else{
            throw new RuntimeException("Transaction not found");
        }
    }

    public void updateTransaction(Integer id,Transaction transaction){
        Transaction existingTransaction= transactionRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Transaction not found"+id));
        if(transaction.getAccountNumber()!=null){
            existingTransaction.setAccountNumber(transaction.getAccountNumber());
        }
        if(transaction.getTransactionType()!=null){
            existingTransaction.setTransactionType(transaction.getTransactionType());
        }
        if(transaction.getBalance()!=null){
            existingTransaction.setBalance(transaction.getBalance());
        }


        transactionRepository.save(existingTransaction);
    }
}
