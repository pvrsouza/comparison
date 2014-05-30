package org.esfinge.comparison.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.esfinge.comparison.reader.delegate.DelegateReader;


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@DelegateReader(WeightComparisonReader.class)
public @interface Weight {
}
