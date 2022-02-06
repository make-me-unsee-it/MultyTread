package com;

import java.math.BigDecimal;

public class Card {
    public BigDecimal accountBalance;

    public Card(String accountBalance) {
        this.accountBalance = new BigDecimal(accountBalance);
    }

    public void balanceAdd(String add) {
        accountBalance = accountBalance.add(new BigDecimal(add));
    }

    public void balanceWithdraw(String withdraw) {
        accountBalance = accountBalance.subtract(new BigDecimal(withdraw));
    }
}
