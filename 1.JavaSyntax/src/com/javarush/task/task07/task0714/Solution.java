package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            arr.add(new Scanner(System.in).nextLine());
        }
        arr.remove(2);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(arr.size() - 1 - i));
        }
    }
}
