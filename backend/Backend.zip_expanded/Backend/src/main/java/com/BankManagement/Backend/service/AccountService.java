package com.BankManagement.Backend.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.BankManagement.Backend.entity.Account;
import com.BankManagement.Backend.repository.AccountRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Optional<Account> findByAccountNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    public void updateBalance(Long accountId, Double newBalance) {
        Account account = accountRepository.findById(accountId)
                                            .orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(newBalance);
        accountRepository.save(account);
    }
}
