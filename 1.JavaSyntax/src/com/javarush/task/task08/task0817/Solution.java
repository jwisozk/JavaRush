package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        List<String> list = new ArrayList<>(map.values());
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (pair.getValue().equals(list.get(i)))
                    count++;
                if  (count > 1)
                {
                    removeItemFromMapByValue(map, pair.getValue());
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
