package com;

abstract public class ATM {
    protected Card currentCard;

    public ATM(Card currentCard) {
        this.currentCard = currentCard;
    }
}
