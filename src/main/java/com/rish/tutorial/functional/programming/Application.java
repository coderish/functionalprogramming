package com.rish.tutorial.functional.programming;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rish.tutorial.functional.programming.functions.AbstractSummaryFunction;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Map<String, AbstractSummaryFunction> listOfFunctionClasses = ctx.getBeansOfType(AbstractSummaryFunction.class);

		System.out.println(listOfFunctionClasses);
	}

}
