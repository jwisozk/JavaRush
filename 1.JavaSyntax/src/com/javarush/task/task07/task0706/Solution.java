package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] arr = new int[15];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
        String e = "четными";
        String o = "нечетными";
        String res;
        if (even > odd)
            res = e;
        else
            res = o;
        System.out.printf("В домах с %s номерами проживает больше жителей.", res);
    }
}
