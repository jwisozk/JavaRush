package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Tom", 30, "Moscow");
        Man man2 = new Man ("Bill", 20, "Kazan\'");
        Woman woman1 = new Woman("Sara", 40, "York");
        Woman woman2 = new Woman("Vera", 10, "SPb");
        System.out.printf("%s %d %s\n", man1.name, man1.age, man1.address);
        System.out.printf("%s %d %s\n", man2.name, man2.age, man2.address);
        System.out.printf("%s %d %s\n", woman1.name, woman1.age, woman1.address);
        System.out.printf("%s %d %s\n", woman2.name, woman2.age, woman2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
