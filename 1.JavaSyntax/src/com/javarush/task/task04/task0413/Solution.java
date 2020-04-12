package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] week = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (n > 0 && n < 8)
            System.out.println(week[n - 1]);
        else
            System.out.println("такого дня недели не существует");
    }
}