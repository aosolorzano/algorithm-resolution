package com.hiperium.algorithms.annotation;

import com.hiperium.algorithms.converter.StringToIntegerArrayConverter;
import org.junit.jupiter.params.converter.ConvertWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@ConvertWith(StringToIntegerArrayConverter.class)
public @interface IntegerArrayConverter {
}
