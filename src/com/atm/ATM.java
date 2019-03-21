package com.atm;

public class ATM {

    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard();

        myCreditCard.getSomeMoney(0);

        // У вас теперь на счету: 100
        myCreditCard.putSomeMoneyUp(0);

        // Остаток по счету: 70
        myCreditCard.putSomeMoneyDown(0); //не нашла как сделать вычисления с этим же методом putSomeMoneyUp


    }
}


