package Lesson4;

/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text~num
 * Нужно раcсплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 * Если ввод не содержит символа ~, то завершает программу с ошибкой.
 * Если введено -1, то выходим
 *
 * string~3
 * java~5
 * print~0 => ""
 * print~3 => string
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            String line = iScanner.nextLine();
            if (line.contains("~")) {
                String[] subline = line.split("~");
                if (!subline[0].equals("print")) {
                    list.add(Integer.parseInt(subline[1]), subline[0]);
                } else {
                    System.out.println(list.get(Integer.parseInt(subline[1])));
                    list.remove(Integer.parseInt(subline[1]));
                }
                continue;
            }
            if (!line.contains("~") && !Objects.equals(line, "-1")) {
                System.out.println("Должна быть строка вида text~num");
                System.exit(0);
            }
            if (Objects.equals(line, "-1")) {
                System.out.println(list);
                iScanner.close();
                return;
            }
        }
    }
}

