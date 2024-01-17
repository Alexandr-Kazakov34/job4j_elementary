package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        }
        return third;
    }

    public static int max(int first, int second, int third, int four) {
        if (first > second && first > third && first > four) {
            return first;
        } else if (second > first && second > third && second > four) {
            return second;
        } else if (third > first && third > second && third > four) {
            return third;
        }
        return four;
    }

    public static void main(String[] args) {
        System.out.println(max(7, 6));
        System.out.println(max(6, 7, 9));
        System.out.println(max(6, 6, 8, 4));
    }
}
