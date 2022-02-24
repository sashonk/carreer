package ru.asocial.edu.career;


import java.util.Arrays;

/**
 * Write a function that checks if a given string is a permutation of a palindrome. (A palindrome is a word or phrase that reads the same
 * forward and backward; permutation - a string containing those
 * same characters in a different order.) A palindrome is not limited to words from
 * dictionary
 */
public class Question4 {

    public static void main(String[] argc) {
        Question4 q = new Question4();
        String input = "caaaassdfrcacdfraaa";
        System.out.println(q.isPalindromePermutation(input.toCharArray()));
    }

    public boolean isPalindromePermutation(char[] input) {
        if (input == null) {
            throw new IllegalArgumentException("Null input provided");
        }
        if (input.length == 0) {
            return false;
        }
        StringDetails details = getDetails(input);
        if (input.length % 2 == 0) {
            return details.unevenSymbolsCount == 0;
        }
        else {
            if (details.unevenSymbolsCount != 1) {
                return false;
            }
            if (details.uniqueSymbolsCount == 2 && details.hasSingleSymbol) {
                return !isPalindrome(input);
            }
            return true;
        }
    }

    private boolean isPalindrome(char[] input) {
        for (int i = 0; i < input.length / 2; i++) {
            if (input[i] != input[input.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    private StringDetails getDetails(char[] input) {
        StringDetails details = new StringDetails();
        char[] sorted = Arrays.copyOf(input, input.length);
        Arrays.sort(sorted);
        int c = 0;
        for (int i = 0; i < sorted.length + 1; i++) {
            if (i > 0 && (i == sorted.length || (sorted[i] != sorted[i-1]))) {
                if (c % 2 == 1) {
                    details.unevenSymbolsCount++;
                }
                if (c == 1) {
                    details.hasSingleSymbol = true;
                }
                details.uniqueSymbolsCount++;
                c = 0;
            }
            c++;
        }

        return details;
    }

    private class StringDetails {
        int unevenSymbolsCount;
        int uniqueSymbolsCount;
        boolean hasSingleSymbol;
    }
}
