package com.rish.tutorial.functional.programming.summary;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.rish.tutorial.functional.programming.functions.AbstractSummaryFunction;
import com.rish.tutorial.functional.programming.journal.Journal;

public class Summarizer {

	@Autowired
	private ApplicationContext context;

	private Map<String, AbstractSummaryFunction> listOfBeans = context.getBeansOfType(AbstractSummaryFunction.class);

	public void summarize(String event, Journal journal) {
		for (AbstractSummaryFunction functionBean : listOfBeans.values()) {
			if (functionBean.test(event))
				functionBean.apply(23.45d, new Journal());
		}
//		updateAllCalculatedSummaries()
	}
}
