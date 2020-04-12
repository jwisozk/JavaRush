package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date d = sdf.parse(sc.nextLine());
        String newDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH).format(d);
        System.out.println(newDate.toUpperCase());
    }
}
