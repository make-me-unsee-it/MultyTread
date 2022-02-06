package com;

import java.math.BigDecimal;

public class Card {
    public BigDecimal accountBalance;

    Card(String accountBalance) {
        this.accountBalance = new BigDecimal(accountBalance);
    }
}
