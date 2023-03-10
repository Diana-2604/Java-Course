package Lesson1;

// Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] fullArray = fillArray(array);
        System.out.println(printArray(fullArray));
    }

    public static int[] fillArray(int[] array) {
        int[] fullArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            fullArray[i] = i+1;
        }
        return fullArray;
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

