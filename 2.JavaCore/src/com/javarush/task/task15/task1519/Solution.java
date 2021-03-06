package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("exit"))
                break;

            if (isNumeric(s)) {
                if (s.contains("."))
                    print(Double.parseDouble(s));
                else
                {
                    int n = Integer.parseInt(s);
                    if (n > 0 && n < 128)
                        print((short)n);
                    else
                        print(n);
                }
            } else
                print(s);
        }
    }
    private static boolean isNumeric(String s) {
        if (s == null)
            return false;
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
