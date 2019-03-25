package com.atm;

public class ATM {

    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard();

        // У вас теперь на счету: 100
        myCreditCard.putSomeMoneyUp(100);

        myCreditCard.putSomeMoneyUp(150);

        myCreditCard.withdraw(70);
    }
}


