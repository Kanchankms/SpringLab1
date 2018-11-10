package com.cg.intro;

public class CurrencyConverterImpl implements CurrencyConverter
{
	private ExchangeService exchangeService;
	
	public CurrencyConverterImpl()
	{
		super();
		System.out.println("CurrencyConverterImpl()");
	}
	
	

	public ExchangeService getExchangeService() {
		
		
		return exchangeService;
	}



	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}



	public double dollarsToRupees(double dollars) {
		
		return dollars*exchangeService.getExchangeRate();
	}

}
