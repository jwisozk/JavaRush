package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr.add(0, sc.nextLine());
        }
        for (String s: arr) {
            System.out.println(s);
        }
    }
}
