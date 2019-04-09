package com.atm;

public class CreditCard {

    protected int cardAmount; //обращаемся "this" к этой переменной
    protected String type; //The type of credit card
    protected int creditLimitAmount;

    public int withdraw(int a) {
        cardAmount = cardAmount - a;
        System.out.println("Остаток по счету:" + cardAmount);
        return cardAmount;
    }


    public void putSomeMoneyUp(int a) {
        cardAmount = cardAmount + a;
        System.out.println("У вас теперь на счету:" + cardAmount);
    }
}