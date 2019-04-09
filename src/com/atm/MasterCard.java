package com.atm;

public class MasterCard extends CreditCard {

    MasterCard() {
        this(0);
    }

    MasterCard(int amount) {
        this(amount, 0);
    }

    MasterCard(int amount, int limit) {
        cardAmount = amount;
        creditLimitAmount = limit;
        type = "MasterCard";
    }
}


