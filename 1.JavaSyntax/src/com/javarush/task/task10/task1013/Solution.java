package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private double height;
        private double weight;
        private boolean sex;
        private String profession;

        public Human(String name, double height, double weight, boolean sex, String profession) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.profession = profession;
        }

        public Human(String name, int age, boolean sex, String profession) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.profession = profession;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age, double height, double weight, boolean sex, String profession) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.profession = profession;
        }

        public Human(String name, int age, double height, double weight, boolean sex) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, int age, double height, double weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}
