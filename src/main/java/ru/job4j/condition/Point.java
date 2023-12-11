package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int sum1 = x2 - x1;
        int sum2 = y2 - y1;
        double pow1 = Math.pow(sum1, 2);
        double pow2 = Math.pow(sum2, 2);
        double result = Math.sqrt(pow1 + pow2);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 3, 4, 5);
        double result3 = Point.distance(1, 2, 2, 6);
        double result4 = Point.distance(3, 4, 5, 7);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result2 (2, 3) to (4, 5) " + result2);
        System.out.println("result3 (1, 2) to (2, 6) " + result3);
        System.out.println("result4 (3, 4) to (5, 7) " + result4);
    }
}
