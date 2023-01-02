package Lesson1;

// Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        String result = checkValue(number);
        System.out.println(number + result);
    }

    public static String checkValue(int number) {
        if (number >= 0) return " является положительным числом";
        else return " является отрицательным числом";
    }

}


