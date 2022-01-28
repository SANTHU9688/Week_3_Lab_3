package com.info.cmd;

public class TacoOvenCmdOff implements Command {
    TacoOven ovenOff;
    
    
	public TacoOvenCmdOff(TacoOven ovenOff) {
		super();
		this.ovenOff = ovenOff;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ovenOff.off();
	}

	
	
}
