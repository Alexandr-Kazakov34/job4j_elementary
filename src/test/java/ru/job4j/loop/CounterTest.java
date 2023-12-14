package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void sumStart0ToFinish10Then45() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 45;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumStart5ToFinish10Then35() {
        int start = 5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 35;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumStart6ToFinish10Then30() {
        int start = 6;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void sumStart10ToFinish5Then0() {
        int start = 10;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}