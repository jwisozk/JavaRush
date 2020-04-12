package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        s.findNum(n);
        System.out.printf("Even: %d Odd: %d", even, odd);

    }

    public void findNum(int n) {
        if (n > 9)
            findNum(n / 10);
        if ((n % 10) % 2 == 0)
            even++;
        else
            odd++;
    }
}
