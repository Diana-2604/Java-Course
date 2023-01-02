/**
 * Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
 * c использованием HashMap
 * <p>
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

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("MMXXII --> " + convertRomanToArabic("MMXXII"));
        System.out.println("MCMXCVIII --> " + convertRomanToArabic("MCMXCVIII"));
        System.out.println("MDCXLII --> " + convertRomanToArabic("MDCXLII"));
        System.out.println("CMIV --> " + convertRomanToArabic("CMIV"));

    }

    public static Integer convertRomanToArabic(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += (map.get(s.charAt(i)));
        }

        return result;
    }
}

