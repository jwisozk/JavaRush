package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 == n2 && n2 == n3)
            System.out.printf("%d %d %d\n", n1, n2, n3);
        else if (n1 == n2)
            System.out.printf("%d %d\n", n1, n2);
        else if (n1 == n3)
            System.out.printf("%d %d\n", n1, n3);
        else if (n2 == n3)
            System.out.printf("%d %d\n", n2, n3);
    }
}