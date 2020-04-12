package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(String value, int m, int n) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) "8");
    }

    public static void printMatrix(int m) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, 3, (Object) "8");
    }

    public static void printMatrix() {
        System.out.println("Заполняем объектами String");
        printMatrix(2, 3, (Object) "8");
    }

    public static void printMatrix(int ... n) {
        System.out.println("Заполняем объектами String");
        printMatrix(n[0], n[1], (Object) n[2]);
    }

    public static void printMatrix(int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(n, n, (Object) value);
    }

    public static void printMatrix(int n, Object value) {
        System.out.println("Заполняем объектами String");
        printMatrix(n, n, value);
    }

    public static void printMatrix(String value, int n) {
        System.out.println("Заполняем объектами String");
        printMatrix(n, n, (Object) value);
    }
}
