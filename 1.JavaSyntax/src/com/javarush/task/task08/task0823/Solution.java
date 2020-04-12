package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        String[] arr = string.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].substring(0,1).toUpperCase() + arr[i].substring(1) + " ");
        }
        System.out.println();
    }
}
