package com.hunglt.mini_banking.controller;

import com.hunglt.mini_banking.dto.AccountBalanceResponse;
import com.hunglt.mini_banking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService service;

    @GetMapping("/balance/{userId}")
    public AccountBalanceResponse getAccountBalance(@PathVariable Long userId) {
        return service.getAccountBalanceByUserId(userId);
    }
}
