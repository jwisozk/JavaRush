package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human dad = new Human("Tom", true, 30);
        Human mom = new Human("Sara", false, 25);
        Human aunt = new Human("Jinn", false, 20);
        Human uncle = new Human("Piter", true, 35);
        Human son1 = new Human("Jorge", true, 15, dad, mom);
        Human son2 = new Human("Frank", true, 10, dad, mom);
        Human son3 = new Human("Stan", true, 5, dad, mom);
        Human daughter1 = new Human("Lilly", false, 15, dad, mom);
        Human daughter2 = new Human("Shelly", false, 18, dad, mom);
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(aunt.toString());
        System.out.println(uncle.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
        System.out.println(daughter1.toString());
        System.out.println(daughter2.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}