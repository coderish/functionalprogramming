package com.rish.tutorial.functional.programming.functions;

import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.rish.tutorial.functional.programming.journal.Journal;

public abstract class AbstractSummaryFunction implements BiFunction<Double, Journal, Double>, Predicate<String> {

}
