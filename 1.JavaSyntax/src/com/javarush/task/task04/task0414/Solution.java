package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = 366;
        int o = 365;
        int x = 0;
        if (n % 400 == 0)
            x = v;
        else if (n % 100 == 0)
            x = o;
        else if (n % 4 == 0)
            x = v;
        else
            x = o;
        System.out.printf("количество дней в году: %d", x);
    }
}