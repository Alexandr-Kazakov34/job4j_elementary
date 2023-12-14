package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        if (num == 0) {
            return false;
        }
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        if (num == 0) {
            return false;
        }
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        if (num == 0) {
            return false;
        }
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num);
    }
}
