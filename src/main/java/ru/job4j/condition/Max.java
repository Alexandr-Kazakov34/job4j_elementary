package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int four) {
        return max(max(first, second), max(third, four));
    }

    public static void main(String[] args) {
        System.out.println(max(7, 6));
        System.out.println(max(6, 7, 9));
        System.out.println(max(6, 6, 8, 4));
    }
}
