package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int n = Integer.parseInt(num);
        if (n > 0)
            n *= 2;
        else if (n < 0)
            n++;
        System.out.println(n);
    }

}