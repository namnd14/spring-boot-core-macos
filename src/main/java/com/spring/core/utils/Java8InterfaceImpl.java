package com.spring.core.utils;

public class Java8InterfaceImpl implements Java8Interface {
    public String sayThird() {
        return "Third";
    }

    @Override
    public String sayFirst() {
        return "First Impl";
    }
}
