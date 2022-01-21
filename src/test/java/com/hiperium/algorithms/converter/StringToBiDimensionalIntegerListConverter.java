package com.hiperium.algorithms.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToBiDimensionalIntegerListConverter extends TypedArgumentConverter<String, List> {

    private static final String EMPTY_ARRAY_STR = "[]";
    protected StringToBiDimensionalIntegerListConverter() {
        super(String.class, List.class);
    }

    @Override
    protected List<Integer[]> convert(String biDimensionalArray) throws ArgumentConversionException {
        List<Integer[]> results = new ArrayList<>();
        if (EMPTY_ARRAY_STR.equals(biDimensionalArray))
            return results;
        String[] rows = biDimensionalArray
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll("\\{", "")
                .replaceAll("}", "")
                .replaceAll("\\s", "")
                .split(";");
        for (String row : rows) {
            String[] strArray = row.split(",");
            Integer[] intArray = new Integer[3];
            for (int i = 0; i < strArray.length; i++) {
                try {
                    intArray[i] = Integer.valueOf(strArray[i]);
                } catch (NumberFormatException e) {
                    System.out.println("ERROR:" + e.getMessage());
                    return results;
                }
            }
            results.add(intArray);
        }
        return results;
    }
}
