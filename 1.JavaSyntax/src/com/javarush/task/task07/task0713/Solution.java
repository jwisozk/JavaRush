package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array.add(Integer.parseInt(sc.nextLine()));
            if (array.get(i) % 3 == 0)
                a1.add(array.get(i));
            if (array.get(i) % 2 == 0)
                a2.add(array.get(i));
            if (array.get(i) % 3 != 0 & array.get(i) % 2 != 0)
                a3.add(array.get(i));
        }
        printList(a1);
        printList(a2);
        printList(a3);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i:list) {
            System.out.println(i);
        }
    }
}
