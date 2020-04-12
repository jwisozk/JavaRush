package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int min = 1000;
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextLine());
            if (min > arr.get(i).length())
                min = arr.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (arr.get(i).length() == min)
                System.out.println(arr.get(i));
        }
    }
}
