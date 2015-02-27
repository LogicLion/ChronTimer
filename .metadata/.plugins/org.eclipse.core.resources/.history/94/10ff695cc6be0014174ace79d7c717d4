import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

enum SensorType{
	PUSH, EYE, GATE, PAD
}


public class Channel {
	
	private Sensor s;
	
	public Channel(){
		s = new Sensor(SensorType.PUSH);
	}
	
	public void arm(){
		s.arm();
	}
	
	public LocalDateTime trigger(){
		return s.trigger();
	}
	
	public void disarm(){
		s.disarm();
	}
	
	public void setSensor(SensorType t){
		s = new Sensor(t);
	}
	

	
}
