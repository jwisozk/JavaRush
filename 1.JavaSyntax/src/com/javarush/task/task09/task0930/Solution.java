package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Вишня", "1", "Боб", "3", "Яблоко", "22", "0", "Арбуз"));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        int k;
        for (int i = 0; i < array.length; i++) {
            k = (isNumber(array[i])) ? 0 : 1;
            for (int j = i; j < array.length; j++) {
                if (k == 0 && isNumber(array[j]) && Integer.parseInt(array[j]) > Integer.parseInt(array[i]))
                    swap(array, i, j);
                if (k == 1 && !isNumber(array[j]) && !isGreaterThan(array[j], array[i]))
                    swap(array, i, j);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static void swap(String[] array, int i, int j) {
        String tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
