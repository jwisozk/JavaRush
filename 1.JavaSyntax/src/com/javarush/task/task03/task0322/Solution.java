package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = Чистая любовь, да-да!");
    }
}