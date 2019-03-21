package com.atm;

public class CreditCard {

    int amount = 0;


    // Конструктор который принимает сумму денег
    public CreditCard() {
    }

    // Снять с карты
    public int getSomeMoney(int amount) {
        // 1) вывести в консоль остаток по счету: "Остаток по счету: {некая_сумма}"
        // 2) возвращаем запрашевоемую сумму
        System.out.println("Остаток по счету:" + amount);
        return this.amount;
    }

    // Пополнить карту
    public void putSomeMoneyUp(int amount) {
        // 1) добавить сумму на счет
        // 2) вывести в консоль фразу: "У вас теперь на счету: {некая_сумма}"
        amount = amount + 100;
        System.out.println("У вас теперь на счету:" + amount);
    }

    public void putSomeMoneyDown(int amount) {
        amount = amount + 70;
        System.out.println("У вас теперь на счету:" + amount);

    }

}