package com.atm;

public class ATM {

    public static void main(String[] args) {

//        CreditCard myCreditCard = new CreditCard();

        //myCreditCard.putSomeMoneyUp(100);

        Visa myCardVisa = new Visa(200);

        MasterCard myCardMasterC = new MasterCard(22, 33);

        System.out.println(myCardMasterC.type);

        CreditCard getFee = new CreditCard();
        getFee.withdraw(4880);



    }
}


