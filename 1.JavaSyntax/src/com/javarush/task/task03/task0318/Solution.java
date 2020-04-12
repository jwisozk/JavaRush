package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import org.w3c.dom.css.CSSUnknownRule;
import org.w3c.dom.ls.LSInput;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);
        String s = reader.readLine();
        System.out.println(s + " захватит мир через " + n + " лет. Му-ха-ха!");
    }
}
