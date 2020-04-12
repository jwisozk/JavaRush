package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream buffer = new FileInputStream(reader.readLine());
        BufferedReader readerBuffer = new BufferedReader(new InputStreamReader(buffer));
        ArrayList<Integer> num = new ArrayList<>();
        String line;
        while ((line = readerBuffer.readLine()) != null)
        {
            int n = Integer.parseInt(line);
            if (n % 2 == 0)
                num.add(n);
        }
        Collections.sort(num);
        for (Integer i: num) {
            System.out.println(i);
        }
        reader.close();
        buffer.close();
        readerBuffer.close();

    }
}
