//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.vogella.eclipse.ide.first;

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public Pet() {
    }

    public void sleep() {
        System.out.println("Спокойной ночи!");
    }

    public void eat() {
        System.out.println("Я голоден!");
    }

    public String say(String aWord) {
        String petResponse = "Ну ладно!" + aWord;
        System.out.println(petResponse);
        return petResponse;
    }

    public void run() {
        System.out.println("Бежим! я вижу еду!");
    }
}
