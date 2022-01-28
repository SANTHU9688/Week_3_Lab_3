package com.info.facade;

import com.info.service.MexicanTaco;
import com.info.service.SpicyTaco;
import com.info.service.Taco;

public class TacoFacade {

	public static String deliverTaco(TacoType type) {

		switch (type) {
		case MEXICAN:
			Taco mexican = new MexicanTaco();
			mexican.prepareTaco("4");
			return mexican.deliverTaco();
		case SPICY:
			Taco spicy = new SpicyTaco();
			spicy.prepareTaco("6");
			return spicy.deliverTaco();

		}
		return null;

	}

}
