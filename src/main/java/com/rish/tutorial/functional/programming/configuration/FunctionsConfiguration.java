package com.rish.tutorial.functional.programming.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rish.tutorial.functional.programming.functions.AccountBalanceFunction;
import com.rish.tutorial.functional.programming.functions.MoneySpentTodayFunction;

@Configuration
public class FunctionsConfiguration {

	@Bean
	public AccountBalanceFunction accountBalanceFunction() {
		return new AccountBalanceFunction();
	}

	@Bean
	public MoneySpentTodayFunction moneySpentTodayFunction() {
		return new MoneySpentTodayFunction();
	}
}
