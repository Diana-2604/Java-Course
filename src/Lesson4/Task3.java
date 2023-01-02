package Lesson4;

// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("Начальный список: " + list);
        list = reverseLinkedList(list);
        System.out.println("Перевернутый список: " + list);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}

