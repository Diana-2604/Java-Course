/**
 * Написать метод, который переведёт данное целое число в римский формат.

 * IV - 4
 * VII - 7
 * - I = 1
 * - V = 5
 * - X = 10
 * - L = 50
 * - C = 100
 * - D = 500
 * - M = 1000
 */

package Lesson5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("2022 --> " + IntegerToRoman(2022));
        System.out.println("1998 --> " + IntegerToRoman(1998));
        System.out.println("1642 --> " + IntegerToRoman(1642));
        System.out.println("904 --> " + IntegerToRoman(904));
    }

    public static String IntegerToRoman(int number) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);

        String result = "";

        for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int match = number/entry.getValue();
            result += repeat(entry.getKey(), match);
            number = number % entry.getValue();
        }
        return result;
    }

    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}

