package com.atm;

public class CreditCard {

    protected int cardAmount; //обращаемся "this" к этой переменной
    protected String type; //The type of credit card
    protected int creditLimitAmount;

    public int withdraw(int a) {

        //нельзя снять больше чем сумма на карте

        if ( (creditLimitAmount + cardAmount) >= a ) {
            cardAmount = cardAmount - a;
            System.out.println("Остаток по счету:" + cardAmount);
            return cardAmount;
        }
        else {
            return 0;
        }
    }

    //амперсанты

    public void putSomeMoneyUp(int a) {
        // пополнять только в том случаи, если сумма пополнения больше нуля

        if (a >= 0){
            cardAmount = cardAmount + a;
        }

    }
}