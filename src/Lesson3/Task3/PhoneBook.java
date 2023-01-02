package Lesson3.Task3;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        if (this.books == null) {
            this.books = new ArrayList<>();
        }
        this.books.add(book);
    }

    public List<Book> getNumbersByName(String name) {
        // Реализовать получение всех номеров по фамилии

        List<Book> result = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getName().toLowerCase().equals(name.toLowerCase())) {
                result.add(book);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Book book : books) {
            sb.append(book.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
