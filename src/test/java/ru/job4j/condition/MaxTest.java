package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then1() {
        int first = 2;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual1To2Then1Or2() {
        int first = 2;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then1() {
        int first = 2;
        int second = 1;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1To3To4Then2() {
        int first = 2;
        int second = 7;
        int third = 1;
        int four = 5;
        int result = Max.max(first, second, third, four);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual1To2To3Then1Or2Or3() {
        int first = 2;
        int second = 2;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual1To2To3To4Then1Or2Or3Or4() {
        int first = 5;
        int second = 5;
        int third = 5;
        int four = 5;
        int result = Max.max(first, second, third, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}