package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
//            firstFileName = reader.readLine();
//            secondFileName = reader.readLine();
            firstFileName = "/Users/iplastun/IdeaProjects/JavaRushTasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/file1.txt";
            secondFileName = "/Users/iplastun/IdeaProjects/JavaRushTasks/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/file2.txt";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;
        public List<String> lines = new ArrayList<String>();

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

//        public void start() {
//            Thread.currentThread().start();
//        }
//        public void join() throws InterruptedException {
//            join();
//        }

        public String getFileContent() {
            return String.join(" ", lines);

        }
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName)));
//                BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
                String line;
                while ((line = reader.readLine()) != null)
                    lines.add(line);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
