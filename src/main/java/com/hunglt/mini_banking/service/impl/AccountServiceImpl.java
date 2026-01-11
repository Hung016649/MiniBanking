package com.hunglt.mini_banking.service.impl;

import com.hunglt.mini_banking.dto.AccountBalanceResponse;
import com.hunglt.mini_banking.entity.Account;
import com.hunglt.mini_banking.repository.AccountRepository;
import com.hunglt.mini_banking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountBalanceResponse getAccountBalanceByUserId(Long userId) {
        Account account = accountRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Account not found for userId: " + userId));
        return AccountBalanceResponse.builder()
                .userName(account.getUser().getUsername())
                .balance(account.getBalance())
                .currency(account.getCurrency())
                .build();
    }
}
