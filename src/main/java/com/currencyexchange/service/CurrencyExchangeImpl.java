package com.currencyexchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.currencyexchange.model.CurrencyExchange;
import com.currencyexchange.repository.CurrencyRepository;

@Service
public class CurrencyExchangeImpl  {

	
	@Autowired
	private CurrencyRepository currencyRepository;
	
	

	//this is main changes
	public CurrencyExchange saveCurrencfsdnfndfy(CurrencyExchange currencyExchange,CurrencyExchange currencyExchange)
	{
		if (!ObjectUtils.isEmpty(currencyExchange)) {
			return currencyRepository.save(currencyExchange);
		} else {
			return null;
		}
	}
	public CurrencyExchange saveCurrency(CurrencyExchange currencyExchange)
	{
		if (!ObjectUtils.isEmpty(currencyExchange)) {
			return currencyRepository.save(currencyExchange);
		} else {
			return null;
		}
	}
	
	public CurrencyExchange getCurrencyConversion(String from ,String to)
	{
		if(!ObjectUtils.isEmpty(to) && !ObjectUtils.isEmpty(from))
		{
		return currencyRepository.findByFromAndTo(from, to);
		}
		else
		{
			return null;
		}
		
	}	
	}
	
	
	

