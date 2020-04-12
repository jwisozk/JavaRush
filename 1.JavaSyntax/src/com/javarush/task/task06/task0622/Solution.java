package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
//        напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
//        int low = 0;
//        int high = arr.length - 1;
//        quickSort(arr, low, high);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

    // вызов рекурсии для сортировки левой и правой части
    if (low < j)
        quickSort(array, low, j);

    if (high > i)
        quickSort(array, i, high);
}

}
