package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int i = 0;
        if (age > anotherCat.age)
            i++;
        else if (age < anotherCat.age)
            i--;
        if (weight > anotherCat.weight)
            i++;
        else if (weight < anotherCat.weight)
            i--;
        if (strength > anotherCat.strength)
            i++;
        else if (strength < anotherCat.strength)
            i--;
        if (i > 0)
            return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
