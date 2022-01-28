package com.info.client;

import com.info.cmd.RemoteControl;
import com.info.cmd.TacoOven;
import com.info.cmd.TacoOvenCmdOff;
import com.info.cmd.TacoOvenCmdOn;
import com.info.facade.TacoFacade;
import com.info.facade.TacoType;

public class OrderTacos {

	public static void main(String[] args) {

		// Facade pattern to order taco
		System.out.println(TacoFacade.deliverTaco(TacoType.MEXICAN));
		System.out.println(TacoFacade.deliverTaco(TacoType.SPICY));

		// Command patter to on/off the Taco Oven
		// Command pattern to on/off the oven
		RemoteControl control = new RemoteControl();
		TacoOven cakeOven = new TacoOven();
		control.setCommand(new TacoOvenCmdOff(cakeOven));
		control.pressButton();

		control.setCommand(new TacoOvenCmdOn(cakeOven));
		control.pressButton();
	}

}
