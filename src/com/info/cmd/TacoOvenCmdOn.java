package com.info.cmd;

public class TacoOvenCmdOn implements Command {
	TacoOven ovenOn;

	public TacoOvenCmdOn(TacoOven ovenOn) {
		super();
		this.ovenOn = ovenOn;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ovenOn.on();
	}
}
