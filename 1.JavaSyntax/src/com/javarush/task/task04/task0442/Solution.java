package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            sum += n;
            if (n == -1)
                break;
        }
        System.out.println(sum);
    }
}
