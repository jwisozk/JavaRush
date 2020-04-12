package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        String y = "Треугольник существует.";
        String n = "Треугольник не существует.";
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1)
            System.out.println(y);
        else
            System.out.println(n);
    }
}