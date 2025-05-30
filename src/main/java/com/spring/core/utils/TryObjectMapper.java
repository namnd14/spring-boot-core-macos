package com.spring.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class TryObjectMapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void toJson() {
        Map<String, String> data = new HashMap<>();
        data.put("userCode", "userCode");
        data.put("description", "description");
        try {
            String response = objectMapper.writeValueAsString(data);
            System.out.println(response);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting to JSON", e);
        }
    }
}
