package com.spring.core.utils;

public interface Java8Interface {
    // static method
    static String producer() {
        return "N&F Vehicles";
    }

    // default method
    default String sayFirst() {
        return "First";
    }

    default String saySecond() {
        return "Second";
    }

    String sayThird();

    default String callStatic() {
        return "producer " + producer();
    }
}
