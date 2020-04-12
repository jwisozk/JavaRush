package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.printf("Меня зовут %s.\nЯ родился %d.%d.%d", name, d, m, y);
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
    }
}
