package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrInt = new int[10];
        String[] arrStr = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = sc.nextLine();
            arrInt[i] = arrStr[i].length();
        }
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
