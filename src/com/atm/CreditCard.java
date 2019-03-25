package com.atm;

public class CreditCard {

    int amount = 0;

    // Снять с карты
    public int withdraw(int amount) {
        // 1) вывести в консоль остаток по счету: "Остаток по счету: {некая_сумма}"
        // 2) возвращаем запрашевоемую сумму
        this.amount = this.amount - amount;
        System.out.println("Остаток по счету:" + this.amount);
        return this.amount;
    }

    // Пополнить карту
    public void putSomeMoneyUp(int amount) {
        // 1) добавить сумму на счет
        // 2) вывести в консоль фразу: "У вас теперь на счету: {некая_сумма}"
        this.amount = this.amount + amount;
        System.out.println("У вас теперь на счету:" + this.amount);
    }
}