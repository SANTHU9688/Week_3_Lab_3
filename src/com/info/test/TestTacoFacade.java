package com.info.test;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.info.facade.TacoFacade;
import com.info.facade.TacoType;

public class TestTacoFacade {
	
	TacoFacade tacoFacade = new TacoFacade();
	
    @Test
	public void testOrderTacoValidType() {
	 	
		assertNotNull(tacoFacade.deliverTaco(TacoType.MEXICAN));
	}

    @Test
	public void testOrderCakeWithInValidCakeType() {
	 	try {
	 		assertNull(tacoFacade.deliverTaco(null));
	 	}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	

}
