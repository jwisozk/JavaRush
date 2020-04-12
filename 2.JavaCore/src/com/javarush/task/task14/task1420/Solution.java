package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;

        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0)
            throw new Exception();
        int max = min(a, b);
        int nod = 0;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0)
                nod = i;
        }
        System.out.println(nod);
    }
}
