package com.info.service;

public class SpicyTaco  implements Taco{
	

	public String preparedTaco;
	

	@Override
	public void prepareTaco(String numberOfTacos) {
		// TODO Auto-generated method stub
		preparedTaco = "Spicy Taco prepared with the number of "+numberOfTacos;
	}

	@Override
	public String deliverTaco() {
		// TODO Auto-generated method stub
		return preparedTaco;
	}

}
