package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        FileInputStream inputStream = null;
        BufferedInputStream buffer = null;
        try {
            String nameFile = reader.readLine();
            inputStream = new FileInputStream(nameFile);
            buffer = new BufferedInputStream(inputStream);
            while (buffer.available() > 0) {
                char c = (char)buffer.read();
                System.out.print(c);
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            buffer.close();
            reader.close();
        }
    }
}