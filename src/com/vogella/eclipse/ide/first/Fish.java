//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.vogella.eclipse.ide.first;

public class Fish extends Pet {
    int currentDepth = 0;

    public Fish() {
    }

    public int dive(int howDeep) {
        this.currentDepth += howDeep;
        System.out.println("Ныряю на грубину " + howDeep + " футов");
        System.out.println("Я на глубине " + this.currentDepth + " фунтов ниже уровня моря");
        return this.currentDepth;
    }

//    public String say(String something) {
//        System.out.println(something);
//        return " Мы не разговариваем";
//    }
}
