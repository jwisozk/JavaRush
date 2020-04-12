package com.javarush.task.task15.task1527;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.Parser;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String[] arr = str.split("http.+\\?|[?& ]");
        for (String s: arr) {
            if (s.equals(""))
                continue;
            if (s.contains("="))
                System.out.print(s.substring(0, s.indexOf('=')));
            else
                System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
        for (String s: arr)
        {
            if (s.contains("obj="))
            {
                String sub = s.substring(s.indexOf('=') + 1);
                try {
                    Double n = Double.parseDouble(sub);
                    alert(n);
                } catch (Exception e) {
                    alert(s.substring(s.indexOf('=') + 1));
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
