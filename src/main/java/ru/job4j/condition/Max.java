package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(max(7, 6));
        System.out.println(max(6, 7));
        System.out.println(max(6, 6));
    }
}
