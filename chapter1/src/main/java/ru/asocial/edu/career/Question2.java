package ru.asocial.edu.career;

import java.util.Arrays;

/**
 * For two strings, write a method to determine if one string is
 * permutation of another
 */
public class Question2 {
    boolean isPermutation(String src, String test) {
        if (src == null || test == null) {
            throw new IllegalArgumentException("Null input provided");
        }
        if (src.length() != test.length()) {
            return false;
        }

        char[] s = src.toCharArray();
        char[] t = src.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        return Arrays.equals(s, t);
    }
}
