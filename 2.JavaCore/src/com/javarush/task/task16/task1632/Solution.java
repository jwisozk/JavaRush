package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new CustomThreadOne());
        threads.add(new CustomThreadTwo());
        threads.add(new CustomThreadThree());
        threads.add(new CustomThreadFour());
        threads.add(new CustomThreadFive());
    }
    public static void main(String[] args) {

    }
    public static class CustomThreadOne extends Thread {
        public void run() {
            while (true)
            {

            }
        }
    }

    public static class CustomThreadTwo extends Thread {
        public void run() {
            if (isInterrupted())
                System.out.println("InterruptedException");
        }
    }

    public static class CustomThreadThree extends Thread {
        public void run() {
            while (true)
            {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class CustomThreadFour extends Thread implements Message {
        private static boolean isCancel = false;
        public void showWarning() {
            isCancel = true;
        }

        public void run() {
            while (!isCancel)
            {

            }
        }
    }

    public static class CustomThreadFive extends Thread {

        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = 0;
            while (true)
            {
                try {
                    String s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(n);
                        return;
                    }
                    n += Integer.parseInt(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}