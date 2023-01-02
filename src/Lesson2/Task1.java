package Lesson2;

// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).

public class Task1 {
    public static void main(String[] args) {
        String word = "Redivider";
        System.out.println(word + " is a palindrome? - " + palindrome(word));

        String word2 = "Racecar";
        System.out.println(word2 + " is a palindrome? - " + palindrome(word2));

        String word3 = "Java";
        System.out.println(word3 + " is a palindrome? - " + palindrome(word3));
    }

    public static boolean palindrome(String word) {
        word = word.toLowerCase();
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
