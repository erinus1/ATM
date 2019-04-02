package com.atm;

public class CreditCard {

    protected int b; //обращаемся "this" к этой переменной

    protected String type; //The type of credit card

    CreditCard() {
        b = 0;
    }

    CreditCard(int a) {
        b = a;
    }

    CreditCard(int a, int c) {
        b = a + c;
    }


    public int withdraw(int a) {
        b = b - a;
        System.out.println("Остаток по счету:" + b);
        return b;
    }


    public void putSomeMoneyUp(int a) {
        b = b + a;
        System.out.println("У вас теперь на счету:" + b);
    }
}