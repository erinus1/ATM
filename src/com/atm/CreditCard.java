package com.atm;

public class CreditCard {

    protected int cardAmount; //обращаемся "this" к этой переменной
    protected String type; //The type of credit card
    protected int creditLimitAmount;

    public int withdraw(int a) {

        // если сумма снятия вся сумма на карте - возвращаем 0 - нельзя снять

        if ( (creditLimitAmount + cardAmount) >= a ) {
            cardAmount = cardAmount - a;
            System.out.println("Остаток по счету:" + cardAmount);
            return cardAmount;
        }
        else {
            return 0;
        }
    }

    /*
    создать метод для расчета комисии при пополнении

    если у карты кредитный лимит > 0 и сумма на карте > 1000 устанавливаем 1
        или у карты кред лимит = 0 и сумма на карте >  3000

    если тип карты виза прибавляем 1
    */


    public void putSomeMoneyUp(int a) {
        // пополнять только в том случаи, если сумма пополнения больше нуля

        if (a >= 0 || a <= 1000){
            cardAmount = cardAmount + a;
        }

        else if (a <= 5000){
            cardAmount = cardAmount + (a - a * 2 / 100);
        }

        else if (type == "master" && a > 5000) {
            cardAmount = cardAmount + (a - a * 3 / 100);
        }

        else {
            cardAmount = cardAmount + (a - a * 1 / 100);
        }


    }

}