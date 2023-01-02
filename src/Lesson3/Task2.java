package Lesson3;

// 2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее(sum / count) из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] array = new int[10];
        fillArray(array);
        fillArrayList(numbers, array);
        sortArray(numbers);
    }

    public static void fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int random = ThreadLocalRandom.current().nextInt(1, 100);
            array[i] = random;
        }
    }

    public static void fillArrayList(ArrayList<Integer> numbers, int[] array) {
        for (int j : array) {
            numbers.add(j);
        }
        System.out.println("Целочисленный список: " + numbers.toString());
    }

    public static void sortArray(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        int len = numbers.size();
        System.out.println("Отсортированный список: " + numbers);
        System.out.println("Минимальное значение: " + numbers.get(0));
        System.out.println("Максимальное значение: " + numbers.get(len - 1));
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        int avg = sum / len;
        System.out.println("Среднее значение: " + avg);
    }
}

