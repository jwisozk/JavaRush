package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > 0)
                count++;
        }
        System.out.println(count);
    }
}
