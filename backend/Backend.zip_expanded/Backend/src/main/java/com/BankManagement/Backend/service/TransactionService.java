package com.BankManagement.Backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.BankManagement.Backend.entity.Transaction;
import com.BankManagement.Backend.repository.TransactionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction> findByAccountId(Long accountId) {
        return transactionRepository.findByAccountAccountId(accountId);
    }

    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
