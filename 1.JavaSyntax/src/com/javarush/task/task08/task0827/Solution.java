package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Locale.*;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date d = new SimpleDateFormat("MMMM d yyyy", ENGLISH).parse(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(d);
        if (calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0)
            return true;
        return false;
    }
}
