package com.atm;

public class Visa extends CreditCard {
    /* Создать три конструктора:
        - пустой (начальная сумма = 0, кредитный лимит = -400)
        - с одной переменной (начальная сумма = переданному значению, кредитный лимит = -400)
        - с двумя (начальная сумма = переданному значению, кредитный лимит = переденному значению)
        type = "Visa" -- всегда
    */

    Visa(){
        this(0);

    }

    Visa(int cardAmount){
        this(cardAmount, 400);

    }

    Visa(int cardAmount, int creditLiminAmount){
        type = "Visa";
        putSomeMoneyUp(cardAmount);
        this.creditLimitAmount = creditLiminAmount;

    }

}