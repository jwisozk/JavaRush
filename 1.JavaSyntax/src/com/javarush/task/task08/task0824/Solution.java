package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Jack", true, 8);
        Human son2 = new Human("Maks", true, 9);
        Human son3 = new Human("Ted", true, 10);
        Human[] grandchildren = {son1, son2, son3};
        Human father = new Human("Dan", true, 30, new ArrayList<>(Arrays.asList(grandchildren)));
        Human mother = new Human("July", false, 31, new ArrayList<>(Arrays.asList(grandchildren)));
        Human grandfa1 = new Human("Bill", true, 60, new ArrayList<>(Arrays.asList(father)));
        Human grandma1 = new Human("Jannet", false, 60, new ArrayList<>(Arrays.asList(father)));
        Human grandfa2 = new Human("John", true, 62, new ArrayList<>(Arrays.asList(mother)));
        Human grandma2 = new Human("Suzy", false, 63, new ArrayList<>(Arrays.asList(mother)));
        ArrayList<Human> family = new ArrayList<>();
        family.add(grandfa1);
        family.add(grandfa2);
        family.add(grandma1);
        family.add(grandma2);
        family.add(father);
        family.add(mother);
        family.addAll(Arrays.asList(grandchildren));
        for (Human member: family) {
            System.out.println(member);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
