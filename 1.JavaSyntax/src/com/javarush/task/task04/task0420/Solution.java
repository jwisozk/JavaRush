package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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
        Integer[] arr = new Integer[]{a,b,c};
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(" ");
        }
    }
}
