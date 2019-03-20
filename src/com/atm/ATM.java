package com.atm;

public class ATM {

    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard();

        // У вас теперь на счету: 100
        myCreditCard.putSomeMoneyUp(100);

        // Остаток по счету: 70
        myCreditCard.putSomeMoneyUp(30);
    }
}
