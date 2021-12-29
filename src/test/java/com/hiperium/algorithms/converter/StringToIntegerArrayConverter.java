package com.hiperium.algorithms.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

public class StringToIntegerArrayConverter extends TypedArgumentConverter<String, Integer[]> {

    protected StringToIntegerArrayConverter() {
        super(String.class, Integer[].class);
    }

    @Override
    protected Integer[] convert(String array) throws ArgumentConversionException {
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
