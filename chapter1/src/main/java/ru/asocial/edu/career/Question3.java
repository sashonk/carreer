package ru.asocial.edu.career;

import java.util.Arrays;

/**
 * Write a method that replaces all spaces in a string with '%20' characters. You can
 * consider that the length of the string allows you to store additional characters,
 * and the actual length of the string is known in advance. (Note: when implementing
 * method in Java to perform an "in-place" operation, use the symbolic
 * array.)
 */
public class Question3 {

    public static void main(String[] argc) {
        String test = "I am greedy    ";
        int len = 11;
        char[] chars = test.toCharArray();
        new Question3().replace(chars, len);
        System.out.println(chars);
    }

    public void replace(char[] input, int len) {
        if (input == null) {
            throw new IllegalArgumentException("Null input provided");
        }

        char[] copy = Arrays.copyOf(input, input.length);
        int index = 0;
        int i;
        for (i = 0; i < len; i++) {
            if (input[i] == ' ') {
                copy[index] = '%';
                copy[index+1] = '2';
                copy[index+2] = '0';
                index+=2;
            }
            else {
                copy[index] = input[i];
            }
            index++;
            input[i] = copy[i];
        }
        for (int j = i ; j < index; j++) {
            input[j] = copy[j];
        }
    }


}
