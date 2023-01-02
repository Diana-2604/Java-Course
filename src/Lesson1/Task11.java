package Lesson1;

// Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len,
// каждая ячейка которого равна initialValue;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int len = iScanner.nextInt();
        System.out.print("Введите значение ячейки массива: ");
        int initialValue = iScanner.nextInt();
        iScanner.close();

        int[] result = createArray(len, initialValue);
        System.out.println(printArray(result));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    public static String printArray(int[] array) {
        StringBuilder result = new StringBuilder("{ ");
        for (int j : array) {
            result.append(j).append(" ");
        }
        result.append("}");
        return result.toString();
    }
}

