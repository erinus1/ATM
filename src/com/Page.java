package com;

import com.forms.PasswordField;

public class Page {
    public static void main(String[] args) {
        PasswordField passwordField = new PasswordField();

        System.out.println("Устанавливем 0 символов");
        System.out.println("Старое значение = " + passwordField.getValue());
        passwordField.setValue("");
        System.out.println("Новое значение = " + passwordField.getValue());

        System.out.println("\nУстанавливем 5 символов");
        System.out.println("Старое значение = " + passwordField.getValue());
        passwordField.setValue("12345");
        System.out.println("Новое значение = " + passwordField.getValue());

        System.out.println("\nУстанавливем 15 символов");
        System.out.println("Старое значение = " + passwordField.getValue());
        passwordField.setValue("123456789012345");
        System.out.println("Новое значение = " + passwordField.getValue());

        System.out.println("\nУстанавливем 16 символов");
        System.out.println("Старое значение = " + passwordField.getValue());
        passwordField.setValue("1234567890123456");
        System.out.println("Новое значение = " + passwordField.getValue());
    }
}
