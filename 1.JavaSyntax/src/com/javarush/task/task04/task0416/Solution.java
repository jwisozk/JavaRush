package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Double t = Double.parseDouble(s);

        String green = "зелёный";
        String yellow = "жёлтый";
        String red = "красный";
        String l = "";
        int max = (int)(t - (t % 10) + 10);
        for (int i = 0; i < max; i += 5) {
            if (t >= i && t < 3 + i)
                l = green;
            else if (t >= 3 + i && t < 4 + i)
                l = yellow;
            else if (t >= 4 + i && t < 5 + i)
                l = red;
        }
        System.out.println(l);
    }
}