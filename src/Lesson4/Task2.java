package Lesson4;

// Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.

import java.util.ArrayDeque;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Содержимое очереди: " + queue);

        Integer poll = queue.poll();
        System.out.println("Poll - возвращает первый элемент и удаляет его: " + poll + " --> " + queue);
        Integer peek = queue.peek();
        System.out.println("Peek - возвращает первый элемент: " + peek + " --> " + queue);
        Integer remove = queue.remove();
        System.out.println("Remove - удаляет первый элемент: " + remove + " --> " + queue);
        System.out.println("FIFO - First In, First Out");
    }
}

