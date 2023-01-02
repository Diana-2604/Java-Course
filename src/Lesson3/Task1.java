package Lesson3;

// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArray(numbers);
        System.out.println("Произвольный список целых чисел: " + printArray(numbers));
        System.out.println("Список без четных чисел: ");
        deleteEvenNumbers(numbers);
    }

    public static void fillArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 100);
            numbers[i] = random;
        }
    }

    public static String printArray(int[] array) {
        StringBuilder result = new StringBuilder("[ ");
        for (int j : array) {
            result.append(j).append(" ");
        }
        result.append("]");
        return result.toString();
    }

    public static void deleteEvenNumbers(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(index, number);
                index++;
            }
        }
        System.out.println(result);
    }
}

