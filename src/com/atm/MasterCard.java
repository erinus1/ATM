package com.atm;

public class MasterCard extends CreditCard {

        MasterCard() {
            super();                //super вызов контруктора из парента
            type = "MasterCard";

        }

        MasterCard(int i){

            super(i);
            type = "MasterCard";

            //сделать перегрузку констурктора

        }

    }


