package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String m = reader.readLine();
        String a = reader.readLine();
        System.out.println(s + " получает " + m + " через " + a + " лет.");
    }
}
