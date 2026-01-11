package com.hunglt.mini_banking.service;

import com.hunglt.mini_banking.dto.AccountBalanceResponse;

public interface AccountService {
    public AccountBalanceResponse getAccountBalanceByUserId(Long userId);
}
