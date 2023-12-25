package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int a = 0;
        for (int i = postfix.length - 1; i >= 0; i--) {
            if (postfix[i] != word[word.length - 1 - a]) {
                result = false;
            }
            a++;
        }
        return result;
    }
}
