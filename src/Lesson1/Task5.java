package Lesson1;

// Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = iScanner.nextLine();
        System.out.print("Введите целое число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        System.out.println(repeatLine(line, number));
    }

    public static String repeatLine(String line, int number) {
        StringBuilder result = new StringBuilder(line);
        for (int i = 1; i < number; i++) {
            result.append("\n").append(line);
        }
        return result.toString();
    }

}

