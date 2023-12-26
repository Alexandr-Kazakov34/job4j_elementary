package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int firstIndex = 0;
        int secondIndex = 1;
        while (firstIndex < array.length) {
            for (int i = secondIndex; i < array.length; i++) {
                if (array[firstIndex] + array[i] == target) {
                    secondIndex = i;
                    return new int[]{firstIndex, secondIndex};
                }
            }
            firstIndex++;
        }

        return new int[0];
    }
}
