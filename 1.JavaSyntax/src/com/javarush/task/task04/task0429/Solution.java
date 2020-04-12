package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int arr[] = {a, b, c};
        int p = 0;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > 0)
                p++;
            if (arr[i] < 0)
                n++;
        }
        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + p);
    }
}
