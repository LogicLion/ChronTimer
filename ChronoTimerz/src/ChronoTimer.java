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

	public void connect(String sensorType, String channel){
		this.stream.connect(sensorType, channel);
	}
	
	public void start(){
		this.stream.startRecord();
	}
	
	public void end(){
		this.stream.finishRecord();
	}
	
	public void num(String runNumber){
		this.stream.num(runNumber);
	}
	
	public void turnOff(){
		System.out.println("OFF");
		this.stream.turnChannelOff(1);
		this.stream.turnChannelOff(2);
	}
	
	public void turnOn(){
		System.out.println("ON");	
		this.stream.turnChannelOff(1);
		this.stream.turnChannelOff(2);	
	}
	
	public void toggle(String channel){
		this.stream.toggle(Integer.parseInt(channel));
	}
	
}
