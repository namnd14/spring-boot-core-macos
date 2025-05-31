package com.spring.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.core.dto.request.DemoForObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class TryObjectMapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void howToUseObjectMapper() {
        try {
            // with Map
            Map<String, String> data = new HashMap<>();
            data.put("userCode", "userCode");
            data.put("description", "description");
            String response = objectMapper.writeValueAsString(data);
            System.out.println(response);

            Map<String, String> data2 = objectMapper.readValue(response, Map.class);
            System.out.println(data2);

            // with POJO
            DemoForObjectMapper demo = new DemoForObjectMapper("name", "description");
            String json = objectMapper.writeValueAsString(demo);

            System.out.println(json);

            DemoForObjectMapper demo2 = objectMapper.readValue(json, DemoForObjectMapper.class);
            System.out.println(demo2.getName());
            System.out.println(demo2.getDescription());

        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error converting to JSON", e);
        }
    }
}
