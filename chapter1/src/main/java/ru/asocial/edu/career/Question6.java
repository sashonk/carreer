package ru.asocial.edu.career;

class Question6 {
    String compressed(String input) {
        if (input == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i > 0 && input.charAt(i) != input.charAt(i-1)) {
                result.append(input.charAt(i-1));
                result.append(c);
                c = 0;
            }
            c++;
        }
        result.append(input.charAt(input.length() - 1));
        result.append(c);
        return result.length() >= input.length() ? input : result.toString();
    }
}
