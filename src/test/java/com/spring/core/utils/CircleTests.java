package com.spring.core.utils;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class CircleTests {
    @Test
    public void testCalculateArea() {
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius;
        double actualArea = Circle.calculateArea(radius);
        assert Math.abs(expectedArea - actualArea) < 0.0001 : "Test failed: expected " + expectedArea + ", but got " + actualArea;
    }

    @Test
    public void givenRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = Circle.calculateArea(1d);
        double expectedArea = 3.141592653589793;
        Assertions.assertEquals(expectedArea, actualArea);
    }
}
