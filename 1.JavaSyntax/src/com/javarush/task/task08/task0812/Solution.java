package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int count = 1;
        int max = 1;
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            if (i != 9 && list.get(i).equals(list.get(i + 1)))
                count++;
            else
                count = 1;
            if (max < count)
                max = count;
        }
        System.out.println(max);
    }
}