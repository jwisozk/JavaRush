package com.javarush.task.task08.task0815;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                map.put("family" + i, "name" + 5);
            else
                map.put("family" + i, "name" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        List<String> list = new ArrayList<String>(map.values());
        int count = 0;
        if (!map.containsValue(name))
            return 0;
        for (String s: list) {
            if (s.equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        if (map.containsKey(lastName))
            return 1;
        return 0;
    }

    public static void main(String[] args) {

    }
}
