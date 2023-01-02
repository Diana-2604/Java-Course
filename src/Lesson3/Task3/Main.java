package Lesson3.Task3;

/* 3.* Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
*/

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addBook(new Book("John", "33344"));
        phoneBook.addBook(new Book("Peter", "344"));
        phoneBook.addBook(new Book("Philipp", "122"));
        phoneBook.addBook(new Book("Philipp", "344"));

        System.out.println(phoneBook);

        List<Book> contacts = phoneBook.getNumbersByName("Philipp");
        System.out.println(contacts);
    }

}

