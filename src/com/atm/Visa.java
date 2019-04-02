package com.atm;


public class Visa extends CreditCard{


    // создать конструктор класса Визы, который запишет в переменную type слово "visa"
    // и вызовет конструктор родителя http://developer.alexanderklimov.ru/android/java/extends.php

    Visa(){
        super();
        type = "visa"; //пустой конструктор из класса credit card
    }


    Visa(int b){

        super(b);
        type = "visa"; //пустой конструктор из класса credit card c int


    }




    }

