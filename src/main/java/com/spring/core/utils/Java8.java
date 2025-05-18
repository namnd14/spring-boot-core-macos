package com.spring.core.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java8 {
    public void log() {
        String producer = Java8Interface.producer();
        System.out.println("Producer: " + producer);

        Java8Interface java8Interface = new Java8InterfaceImpl();
        System.out.println(java8Interface.sayFirst());
        System.out.println(java8Interface.saySecond());

        testOptional();
    }

    public static void testOptional() {
        Optional<String> optional = Optional.empty();

        String str = "value";
        Optional<String> optional2 = Optional.of(str);

        Optional<String> optional3 = Optional.ofNullable(null);

        List<String> listOpt = Optional.ofNullable(getList()).orElseGet(() -> new ArrayList<>());
        System.out.println(listOpt);
    }

    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("value1");
        return list;
        // return null;
    }
}
