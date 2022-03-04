package ru.asocial.edu.career;

/**
 * Suppose there is an isSubstring method that checks whether
 * one word is a substring of another. Given two strings s1 and s2, write code that checks whether string s2 was obtained by cyclic shifting s1 using
 * only one call to the isSubstring method (example: the word "waterbottle" received
 * cyclic shift "erbottlewat").
 */
public class Question9 {

    public static void main(String[] argc) {
        Question9 q = new Question9();
        System.out.println(q.isCyclicShift("erbottlewat", "waterbottle"));
    }

    boolean isCyclicShift(String src, String test){
        return isSubstring(src + src, test);
    }

    private boolean isSubstring(String src, String test){
        return src.contains(test);
    }
}
