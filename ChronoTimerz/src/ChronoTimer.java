import java.time.LocalDateTime;

public class ChronoTimer {
	
	IStream _stream;
	Channel _channels[];
	boolean _isOn;
	
	ChronoTimer(){
		_stream = new IndividualStream();
		_channels = new Channel[2];
		_channels[0] = new Channel();
		_channels[1] = new Channel();
	}
	
	public void turnOn(){
		_isOn=true;
	}
	
	public void turnOff(){
		_isOn=false;
	}
	

	public void connect(String sensorType, int channel){
		if(_isOn)
		{
		_channels[channel-1].connect(sensorType);
		}
	}
	public void toggle(int channel){
		if(_isOn)
		{
		_channels[channel-1].toggle();
		}
	}
	
	public void start(){
		if(_isOn)
		{
			_stream.startRecord(_channels[0].trigger());
		}
	}
	
	public void end(){
		if(_isOn)
		{
			_stream.finishRecord(_channels[1].trigger());	
		}
		
	}
	
	public void num(int runNumber)
	{
		if(_isOn)
		{
			_stream.num(runNumber);
		}
	}
	
	public void print(){
		if(_isOn)
		{
			System.out.println(_stream.toString());
		}
	}

	public void DNF() {
		if(_isOn)
		{
			_stream.DNFRecord();
		}
	}

	public void cancel() {
		if(_isOn)
		{
			_stream.DNFRecord();
		}
	}
	

	

	
}
