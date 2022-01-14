package com.hiperium.algorithms.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

import java.util.Arrays;

public class StringToIntegerArrayConverter extends TypedArgumentConverter<String, Integer[]> {

    private static final String EMPTY_ARRAY_STRING = "[]";
    protected StringToIntegerArrayConverter() {
        super(String.class, Integer[].class);
    }

    @Override
    protected Integer[] convert(String array) throws ArgumentConversionException {
        if (EMPTY_ARRAY_STRING.equals(array))
            return new Integer[0];
        String[] items = array
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll("\\s", "")
                .split(",");
        Integer[] results = new Integer[items.length];
        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException e) {
                System.out.println("ERROR:" + e.getMessage());
                return new Integer[0];
            }
        }
        return results;
    }
}
