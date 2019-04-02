package com.atm;

public class CreditCard {

    int b; //обращаемся "this" к этой переменной

    protected String type; // The type of credit card

    CreditCard() { //конструктор
        b = 0;
    }

    CreditCard(int a) {  //конструктор совпадает с именем класса
        b = a;
    }

    // Снять с карты
    public int withdraw(int a) {
        // 1) вывести в консоль остаток по счету: "Остаток по счету: {некая_сумма}"
        // 2) возвращаем запрашевоемую сумму
        b = b - a;
        System.out.println("Остаток по счету:" + b);
        return b;
    }

    // Пополнить карту
    public void putSomeMoneyUp(int a) {
        // 1) добавить сумму на счет
        // 2) вывести в консоль фразу: "У вас теперь на счету: {некая_сумма}"
        b = b + a;
        System.out.println("У вас теперь на счету:" + b);
    }
}