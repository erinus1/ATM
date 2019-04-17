package com.atm;

public class MasterCard extends CreditCard {

        MasterCard(){
            super();                //super вызов контруктора из парента
            type = "MasterCard";

        }

        MasterCard(int b){

            super(b);
            type = "MasterCard";

            //сделать перегрузку констурктора

        }

    }


