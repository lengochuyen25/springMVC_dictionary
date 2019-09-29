package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chao");
        dictionary.put("how", "The nao");
        dictionary.put("book", "Quyen vo");
        dictionary.put("computer", "Maytinh");
    }

    public String getValue(String text) {
        return dictionary.get(text);
    }
}
