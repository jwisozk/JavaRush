package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            arr.add(new Scanner(System.in).nextLine());
        }

        for (int i = 0; i < 13; i++) {
            arr.add(0, arr.remove(4));
        }
        for (String s: arr) {
            System.out.println(s);
        }
    }
}
