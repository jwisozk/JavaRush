package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        int count = 5;
        while (count-- > 0)
            result += s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        while (count-- > 0)
            result += s;
        return result;
    }

    public static void main(String[] args) {

    }
}
