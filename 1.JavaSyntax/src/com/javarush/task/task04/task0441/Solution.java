package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c)
            System.out.println(a);
        else if (a == b)
            System.out.println(a);
        else if (b == c)
            System.out.println(b);
        else if (a == c)
            System.out.println(c);
        else if ((a > b && a < c) || (a > c && a < b))
            System.out.println(a);
        else if ((b > a && b < c) || (b > c && b < a))
            System.out.println(b);
        else
            System.out.println(c);
    }
}
