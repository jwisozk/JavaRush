package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 999)
            return;
        int count = Solution.getCount(n);
        if (count == 3) {
            if (n % 2 == 0)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");
        } else if (count == 2) {
            if (n % 2 == 0)
                System.out.println("четное двузначное число");
            else
                System.out.println("нечетное двузначное число");
        } else {
            if (n % 2 == 0)
                System.out.println("четное однозначное число");
            else
                System.out.println("нечетное однозначное число");
        }
    }

    public static int getCount(int n) {
        int i = 1;
        if (n > 9)
            i += getCount(n / 10);
        return (i);
    }
}
