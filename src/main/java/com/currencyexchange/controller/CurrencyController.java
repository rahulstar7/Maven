package com.currencyexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.currencyexchange.model.CurrencyExchange;
import com.currencyexchange.service.CurrencyExchangeImpl;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyExchangeImpl service;
	
	@PostMapping(value = "/saveCurrency")
	public CurrencyExchange saveCurrency(@RequestBody CurrencyExchange  currencyExchange)
	{
		
		if(!ObjectUtils.isEmpty(currencyExchange))
		{
		return	service.saveCurrency(currencyExchange);
		}
		else
		{
			return null;
		}	
	}
	
	@GetMapping(value="/currency/from/{from}/to/{to}")
	public CurrencyExchange currencyExchangeConversion(@PathVariable String from , @PathVariable String to)
	
	{
		
		if(!ObjectUtils.isEmpty(to) && !ObjectUtils.isEmpty(from))
		{
			return service.getCurrencyConversion(from, to);
		}
		else
		{
			return null;
		}	
		
		
		
		
		
		
	}
	
	
	
	
}
