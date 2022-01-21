package com.hiperium.algorithms.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

import java.util.ArrayList;
import java.util.List;

public class StringToBiDimensionalStringListConverter extends TypedArgumentConverter<String, List> {

    protected StringToBiDimensionalStringListConverter() {
        super(String.class, List.class);
    }

    @Override
    protected List<List<String>> convert(String array) throws ArgumentConversionException {
        String[] rows = array
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
        List<List<String>> results = new ArrayList<>();
        for (String row : rows) {
            String[] values = row.split("\\|");
            results.add(List.of(values[0].stripLeading(), values[1]));
        }
        return results;
    }
}
