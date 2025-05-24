package com.spring.core.utils;

import java.util.HashMap;
import java.util.Map;

public class SortColumnMapper {
    private SortColumnMapper() {
        // prevent instantiation
    }

    // Mapping of allowed API sort keys to SQL column names (use aliases if needed)
    private static final Map<String, String> SORT_COLUMN_MAP = new HashMap<>();

    static {
        SORT_COLUMN_MAP.put("id", "id");
        SORT_COLUMN_MAP.put("name", "country_name");
    }

    public static String toSqlOrderBySearchCountry(String sortBy) {
        return SORT_COLUMN_MAP.get(sortBy);
    }
}
