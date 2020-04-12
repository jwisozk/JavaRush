package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        int min = 1000;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            arr.add(new Scanner(System.in).nextLine());
            if (min > arr.get(i).length())
                min = arr.get(i).length();
            if (max < arr.get(i).length())
                max = arr.get(i).length();
        }
        for (String s: arr) {
            if (s.length() == min || s.length() == max) {
                System.out.println(s);
                break;
            }
        }
    }
}
