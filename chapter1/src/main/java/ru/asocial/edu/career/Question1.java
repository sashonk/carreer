package ru.asocial.edu.career;

import java.util.Arrays;

/**
 * Implement an algorithm that determines whether all characters in a string occur only once.
 * And if the use of additional data structures is prohibited?
 */
public class Question1 {

    public boolean allUniqueSymbols(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input provided");
        }
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (i > 0) {
                if (chars[i] == chars[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
