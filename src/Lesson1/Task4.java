package Lesson1;

// Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        boolean result = checkValue(number);
        System.out.println(result);
    }

    public static boolean checkValue(int number) {
        return number < 0;
    }
}



