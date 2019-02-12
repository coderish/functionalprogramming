package com.rish.tutorial.functional.programming.functions;

import java.util.Arrays;
import java.util.List;

import com.rish.tutorial.functional.programming.journal.Journal;

public class MoneySpentTodayFunction extends AbstractSummaryFunction {
	private List<String> appliesToEventList = Arrays.asList("Financial", "blah", "clah");

	@Override
	public Double apply(Double currentTransaction, Journal journal) {
		return currentTransaction*2;
	}

	@Override
	public boolean test(String event) {
		return appliesToEventList.contains(event);
	}
}
