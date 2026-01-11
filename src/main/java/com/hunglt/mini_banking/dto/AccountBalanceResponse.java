package com.hunglt.mini_banking.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class AccountBalanceResponse {
    private String userName;
    private BigDecimal balance;
    private String currency;
}
