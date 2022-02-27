package ru.asocial.edu.career;

/**
 * There are three types of modifying operations on strings: insertion
 * character, deleting a character, and replacing a character. Write a function that
 * checks if two strings are one modification apart (or
 * zero modifications).
 */
class Question5 {

    boolean isSingleModification(String src, String test) {
        if (src == null || test == null) {
            throw new IllegalArgumentException("Null value provided");
        }
        int diff = src.length() - test.length();
        if (diff > 1 || diff < -1) {
            return false;
        }
        int modifications = 0;
        for (int i = 0, j = 0; (i < src.length() || j < test.length()); i++, j++) {
            if (i == src.length() || j == test.length() || src.charAt(i) != test.charAt(j)) {
                if (modifications > 0) {
                    return false;
                }
                modifications++;
                if (diff == 1)
                    j--;
                if (diff == -1)
                    i--;
            }
        }

        return  true;
    }

}
