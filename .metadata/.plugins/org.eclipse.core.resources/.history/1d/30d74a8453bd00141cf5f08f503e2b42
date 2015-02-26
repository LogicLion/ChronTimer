import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class IndividualStream {

private TimingRecord[] _stream;
private LocalDateTime _start;
private int _currentRecord;
private int _capacity;

public IndividualStream(int size)
{
	_start = LocalDateTime.now();
	_stream=new TimingRecord[size];
	for(int i=0; i<size; ++i)
	{
		_stream[i] = new TimingRecord();
	}
	_currentRecord=0;
	_capacity=size;
}

public void CancelRecord(){
	_stream[_currentRecord].cancel();
	System.out.println(_stream[_currentRecord].toString());
	_currentRecord++;
	System.out.println("Next Racer");
}

public void startRecord()
{
	_stream[_currentRecord].start();
	System.out.println(_stream[_currentRecord].toString());
}

public void finishRecord(){
	_stream[_currentRecord].finish();
	System.out.println(_stream[_currentRecord].toString());
	_currentRecord++;
	System.out.println("Next Racer");
	
}

public void DNFRecord(){
	_stream[_currentRecord].DNF();
	System.out.println(_stream[_currentRecord].toString());
	_currentRecord++;
	System.out.println("Next Racer");
}

public TimingRecord[] get_stream(){
	return _stream;
}

}
