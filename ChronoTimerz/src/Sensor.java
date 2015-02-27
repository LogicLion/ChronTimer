import java.time.LocalDateTime;



public class Sensor {
	
	String typeOfSensor;
	private boolean isArmed;
	private int channelNum;
	
	public Sensor(String sensorType, int channelNum){
		this.typeOfSensor = sensorType;
		this.channelNum = channelNum;
	}
	
	public void disarm(){
		System.out.println("Disarmed!");
	}
	
	public void arm(){
		System.out.println("Armed");
		isArmed = true;
	}
	
	public LocalDateTime trigger(){
		System.out.println("TRIGGERED!");
		return isArmed ? LocalDateTime.now() : null;
	}
	
	public String toString(){
			return "I AM A " + this.typeOfSensor + " SENSOR on CHANNEL: " + this.channelNum;
	}
	
	public void toggle(){
		if(isArmed) this.disarm();
		else{
			this.arm();
		}
	}
	
	public int getChannelNum(){
		return this.channelNum;
	}
	
	
}
