package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i != 0 && i % 2 == 0)
                people.put("Family" + 5, "Name" + i);
            else if (i == 0)
                people.put("Family" + i, "Name" + 1);
            else
                people.put("Family" + i, "Name" + i);
        }
        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
