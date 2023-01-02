package Lesson3.Task3;

public class Book {
    private String number;
    private String name;

    public Book(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "(" + name + "; " + number + ")";
    }
}
