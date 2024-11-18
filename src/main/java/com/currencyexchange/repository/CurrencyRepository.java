package com.currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currencyexchange.model.CurrencyExchange;

public interface CurrencyRepository extends JpaRepository<CurrencyExchange, Long> {

	
	public CurrencyExchange findByFromAndTo(String from ,String to);
	
}
