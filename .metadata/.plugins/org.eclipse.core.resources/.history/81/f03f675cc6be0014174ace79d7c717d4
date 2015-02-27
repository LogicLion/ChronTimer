enum compType{
	IND, PARIND, GRP, PARGRP
}

public class ChronoTimer {
	
	IndividualStream stream;
	//int runNumber;
	Channel channels[];
	//compType competition;
	
	ChronoTimer(){
		this.stream = new IndividualStream();
	}

	public void start(){
		this.stream.startRecord();
	}
	
	public void end(){
		this.stream.finishRecord();
	}
	
	public void turnOff(){
		System.out.println("OFF");
	}
	
	public void turnOn(){
		System.out.println("ON");	
	}
	
}
