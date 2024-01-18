package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus23to45then2Dot32() {
        double expected = 6.32;
        Point a = new Point(3, -2);
        Point b = new Point(5, 4);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus12to26then5() {
        double expected = 5;
        Point a = new Point(2, -1);
        Point b = new Point(6, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when34to57then3Dot60() {
        double expected = 3.60;
        Point a = new Point(4, 3);
        Point b = new Point(7, 5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when534to357then4Dot12() {
        double expected = 4.12;
        Point a = new Point(4, 3, 5);
        Point b = new Point(7, 5, 3);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when644to127then6Dot16() {
        double expected = 6.16;
        Point a = new Point(4, 4, 6);
        Point b = new Point(7, 2, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}