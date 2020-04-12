package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int i = 0;
        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма"))
                break;
            i += Integer.parseInt(s);
        }
        System.out.println(i);
    }
}
