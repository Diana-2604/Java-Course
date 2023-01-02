package Lesson4;

// Написать метод, который принимает массив элементов,
// помещает их в стэк и выводит на консоль содержимое стэка.

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println("Содержимое стэка: " + stack);

        Integer pop = stack.pop();
        System.out.println("Pop - возвращает последний элемент и удаляет его: " + pop + " --> " + stack);
        Integer peek = stack.peek();
        System.out.println("Peek - возвращает последний элемент: " + peek + " --> " + stack);
        System.out.println("LIFO - Last In, First Out");
    }
}

