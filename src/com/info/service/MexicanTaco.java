package com.info.service;

public class MexicanTaco implements Taco{
	
	public String preparedTaco;
	

	@Override
	public void prepareTaco(String numberOfTacos) {
		// TODO Auto-generated method stub
		preparedTaco = "Mexican taco prepared with the number of "+numberOfTacos;
	}

	@Override
	public String deliverTaco() {
		// TODO Auto-generated method stub
		return preparedTaco;
	}

}
