package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;
        try {
            String s;
            String nameFile = reader.readLine();
            writer = new BufferedWriter(new FileWriter(nameFile));
            while (true) {
                s = reader.readLine();
                writer.write(s);
                writer.newLine();
                if (s.equals("exit"))
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }

    }
}
