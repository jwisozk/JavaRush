package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int len = 0;
        for (int i = 0; i < 10; i++) {
            list.add(new Scanner(System.in).nextLine());
        }
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > len)
                len = list.get(i).length();
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

