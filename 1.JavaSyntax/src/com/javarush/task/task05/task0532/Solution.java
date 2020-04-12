package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int i = Integer.parseInt(reader.readLine());
        while (i > 0) {
            int tmp = Integer.parseInt(reader.readLine());
            if (maximum == 0)
                maximum = tmp;
            else if (tmp > maximum)
                maximum = tmp;
            i--;
        }
        System.out.println(maximum);
    }
}