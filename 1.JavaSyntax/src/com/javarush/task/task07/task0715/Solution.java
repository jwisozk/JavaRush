package com.javarush.task.task07.task0715;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("мама");
        arr.add("мыла");
        arr.add("раму");
        for (int i = 1; i <= arr.size(); i += 2) {
            arr.add(i, "именно");
        }
        for (String s :arr) {
            System.out.println(s);
        }

    }
}
